package com.coderising.jvm.constant;

public class ClassInfo extends ConstantInfo{
	
	private int type = ConstantInfo.CLASS_INFO;//  ��ʾ�ó���Ϊ ���ӿڵķ�������
	private int utf8Index;//  CONSTANT_Class_info �ͳ����� �������ṹ�е� name_index�� name_index ָ��������һ�� CONSTANT_Utf8_info ���͵ĳ���
	
	public ClassInfo(ConstantPool pool){
		super(pool);
	}
	
	public int getUtf8Index(){
		return utf8Index;
	}
	
	public void setUtf8Index(int utf8Index){
		this.utf8Index = utf8Index;
	}
	
	@Override
	public int getType(){
		return type;
	}
	
	// ��������
	public String getClassName(){
		int index = getUtf8Index();
		UTF8Info utf8Info = (UTF8Info)constantPool.getConstantInfo(index);
		return utf8Info.getValue();
	}
	
	
}