/*package br.com.nextstep;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NextstepApplicationTests {

	@Test
	void contextLoads() {
	}

}
*/
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class NextstepApplicationTests {

    @Test
    void contextLoads() {}
}
