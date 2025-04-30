package N1;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2087a = Charset.forName("UTF-8");

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
