import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * 创建日期 2009-9-12
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */

/**
 * @author xxzxxz
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */
public class MyPanel extends JPanel implements ActionListener{
	
	State state;
	MyFrame frame;
	public MyPanel(MyFrame f)
	{
		frame=f;
		JButton yellow=new JButton("黄色状态");
		JButton green=new JButton("绿色状态");
		JButton red=new JButton("红色状态");
		JButton black=new JButton("黑色状态");
		JButton blue=new JButton("蓝色状态");
		
		yellow.addActionListener(this);
		green.addActionListener(this);
		red.addActionListener(this);
		black.addActionListener(this);
		blue.addActionListener(this);
		add(yellow);add(green);add(red);add(black);	add(blue);	
		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);		
		setBackground(state.getColor());
		
	}
	public void setState_and_save(State s)
	{
		frame.states.push(state);
		state=s;		
		repaint();
	}
	public void setState_and_save2(State s)
	{
		frame.states2.push(state);
		state=s;		
		repaint();
	}
	public void setState(State s)
	{
		state=s;		
		repaint();
	}
	public void actionPerformed(ActionEvent arg0) {
		// TODO 自动生成方法存根
		if(arg0.getActionCommand().equals("黄色状态"))setState_and_save(MyFrame.yellow_state);
		else if(arg0.getActionCommand().equals("绿色状态"))setState_and_save(MyFrame.green_state);
		else if(arg0.getActionCommand().equals("红色状态"))setState_and_save(MyFrame.red_state);
		else if(arg0.getActionCommand().equals("黑色状态"))setState_and_save(MyFrame.black_state);
		else if(arg0.getActionCommand().equals("蓝色状态"))setState_and_save(MyFrame.blue_state);
		
	}

	
}
