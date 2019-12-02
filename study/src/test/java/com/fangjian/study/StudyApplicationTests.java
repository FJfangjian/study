package com.fangjian.study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudyApplicationTests {

	@Test
	void contextLoads() {
		A a = new A();
		ThreadLocal threadLocal = new ThreadLocal();
		new Thread(()->{

		});
	}

}
class  A{
	private String s;
	private String sb;

	public String getSb() {
		return sb;
	}

	public void setSb(String sb) {
		this.sb = sb;
	}

	public String getS() {

		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
}
