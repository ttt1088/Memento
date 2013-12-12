import java.util.LinkedList;
import java.util.Stack;

/*
 * 创建日期 2009-10-17
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
public class StateStack {
	Stack statelist=new Stack();
	public void push(State o)
	{
		statelist.push(o);
	}
	public State pop()
	{
		State state=null;
		if(!statelist.isEmpty())
			state=(State)statelist.pop();
			return state;
	}
	public boolean hasMore()
	{
		return(!statelist.isEmpty());
	}
	public void clear()
	{
		statelist.clear();
	}

}
