import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	JMenuBar jb=new JMenuBar();
	JMenu op=new JMenu("操作");
	JMenuItem back=new JMenuItem("回溯经过状态");
	JMenuItem next=new JMenuItem("下一个状态");
	JMenuItem clear=new JMenuItem("恢复初始状态");
	JMenuItem exit=new JMenuItem("退出");
	MyPanel mp;
	StateStack states=new StateStack();
	StateStack states2=new StateStack();
	static State black_state;
	static State yellow_state;
	static State green_state;
	static State red_state;
	static State blue_state;
	public void init()
	{
		mp=new MyPanel(this);
		black_state=new State(Color.black);
		yellow_state=new State(Color.yellow);
		green_state=new State(Color.green);
		red_state=new State(Color.red);	
		blue_state=new State(Color.blue);	
		mp.setState_and_save(black_state);
	}
	public MyFrame()
	{
		this.setJMenuBar(jb);
		jb.add(op);
		
		op.add(back);op.add(next);op.add(clear);op.add(exit);
		setSize(500,300);
		exit.addActionListener(this);
		back.addActionListener(this);
		next.addActionListener(this);
		clear.addActionListener(this);
		init();
		
		getContentPane().add(mp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("回溯经过状态")){
			mp.setState_and_save2(mp.state);
			State s=states.pop();
			if(s!=null)mp.setState(s);			
		}
		else if(arg0.getActionCommand().equals("下一个状态")){
			mp.setState_and_save(mp.state);
			State s=states2.pop();
			if(s!=null)mp.setState(s);
		}
		else if(arg0.getActionCommand().equals("恢复初始状态")){
			states.clear();
			mp.setState(black_state);
			
		}		
		else if(arg0.getActionCommand().equals("退出"))System.exit(0);
	}

}
