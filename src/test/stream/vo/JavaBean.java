package stream.vo;

import java.util.Date;

/**
 * JavaBean
 *
 * @author 欧阳洁
 * @date 2020/8/3 22:49
 */
public class JavaBean {
    private Long keyId;
    private Long value;
    private Long score;

    public Long getKeyId() {
        return keyId;
    }

    public void setKeyId(Long keyId) {
        this.keyId = keyId;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public void doSomething() {
        System.out.println(System.currentTimeMillis());
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }
}
