package �����ڲ���;

public class Waibulei {
	 private String name = "baobao";
	    
	    // �ⲿ���е�show����
	    public void show() { 
			// ���巽���ڲ���
			class MInner {
				int score = 83;
				public int getScore() {
					return score + 10;
				}
			}
	        
			// ���������ڲ���Ķ���
	        MInner in = new MInner();
	        
	        // �����ڲ���ķ���
			System.out.println("������" + name + "\n�ӷֺ�ĳɼ���" + in.getScore());
		}
	    
		// ���Է����ڲ���
		public static void main(String[] args) {
	        
			// �����ⲿ��Ķ���
	        Waibulei mo = new Waibulei();
	        
	        // �����ⲿ��ķ���
			mo.show();
		}
}
