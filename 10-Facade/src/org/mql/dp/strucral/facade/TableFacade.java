package org.mql.dp.strucral.facade;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class TableFacade extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTable table;
	private DefaultTableModel model;
	private JLabel label;
	private List<CellProperties[]> props;

	public TableFacade(String title, String... columnNames) {
		setLayout(new BorderLayout(5, 5));
		label = new JLabel(title);
		label.setFont(new Font("Verdana", Font.PLAIN, 18));

		label.setHorizontalAlignment(JLabel.CENTER);
		label.setOpaque(true);
		label.setBackground(Color.gray);
		label.setForeground(Color.blue);

		add("North", label);

//		model = new DefaultTableModel(columnNames, 0);
		model = new NotEditableTableModel(columnNames, 0);
		table = new JTable(model);
		add("Center", new JScrollPane(table));

		setBorder(new CompoundBorder(new EmptyBorder(10, 10, 10, 10),

				new CompoundBorder(new LineBorder(Color.blue), new EmptyBorder(10, 10, 10, 10))));

		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);

		TableColumnModel tableColumnModel = table.getColumnModel();
		for (int i = 0; i < columnNames.length; i++) {
			TableColumn column = tableColumnModel.getColumn(i);
			column.setCellRenderer(new CellRender());
		}

		props = new Vector<TableFacade.CellProperties[]>();

	}

	public void addRow(String... row) {
		model.addRow(row);
		CellProperties p[] = new CellProperties[row.length];
		for (int i = 0; i < p.length; i++) {
			p[i] = new CellProperties();
		}
		props.add(p);
	}

	public void setCellBackground(int row, int column, Color color) {
		props.get(row)[column].setBackground(color);
	}

	public void setColumnBackground(int column, Color color) {
		for (CellProperties[] cell : props) {
			cell[column].setBackground(color);
		}
	}

	// *******************************************************************************************************************
	private class CellRender extends DefaultTableCellRenderer {
		private static final long serialVersionUID = 1L;

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			/*
			 * if (row == 1 && column == 2) { cell.setBackground(Color.yellow); } else {
			 * cell.setBackground(Color.white); }
			 */
			cell.setBackground(props.get(row)[column].getBackground());
			cell.setForeground(props.get(row)[column].getForground());
			return cell;
		}
	}

	private class NotEditableTableModel extends DefaultTableModel {

		private static final long serialVersionUID = 1L;

		public NotEditableTableModel(String[] columnNames, int rows) {
			super(columnNames, rows);
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}

	}

	private class CellProperties {
		private Color background;
		private Color forground;

		public CellProperties() {
			background = Color.white;
			forground = Color.black;
		}

		public CellProperties(Color background, Color forground) {
			super();
			this.background = background;
			this.forground = forground;
		}

		public Color getBackground() {
			return background;
		}

		public Color getForground() {
			return forground;
		}

		public void setBackground(Color background) {
			this.background = background;
		}

		public void setForground(Color forground) {
			this.forground = forground;
		}

	}
}
