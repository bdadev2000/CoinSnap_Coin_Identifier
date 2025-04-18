package e4;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public interface j {
    public static final Charset a = Charset.forName("UTF-8");

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
