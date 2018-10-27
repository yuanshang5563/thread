package org.ys.thread.annotation;

import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import javax.swing.JButton;

public class AnnotationProcessor {
	public void processAnnotation(MainFrame mainFrame) throws Exception{
		Field[] fields = mainFrame.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			Object fieldObj = field.get(mainFrame);
			ActionListenerFor actionListenerFor = field.getAnnotation(ActionListenerFor.class);
			if(null != fieldObj && null != actionListenerFor && fieldObj instanceof JButton){
				Class<? extends ActionListener> listenerClazz = actionListenerFor.listener();
				JButton button = (JButton)fieldObj;
				ActionListener listener = listenerClazz.newInstance();
				button.addActionListener(listener);
			}
		}
	}
}
