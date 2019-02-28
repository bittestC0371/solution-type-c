package problem02;

public class MyService extends BaseService {
	@Override
	public void service(String state) {
		String result = null;
		switch(state) {
		case "낮":
			result = day();
			break;
		case "오후":
			result = afternoon();
			break;
		case "밤":
			result = night();
			break;
		}
		System.out.println(result + start());
	}
	
	public String start() {
		return " 서비스 시작";
	}

	public String afternoon() {
		return "오후";
	}
}
