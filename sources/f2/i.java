package F2;

import G7.j;
import android.text.TextUtils;
import com.facebook.r;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1144a = new Object();

    public static final int a(int[] iArr) {
        if (iArr.length != 0) {
            int i9 = iArr[0];
            int i10 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    i9 *= iArr[i10];
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            return i9;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final File b() {
        if (O2.a.b(i.class)) {
            return null;
        }
        try {
            File file = new File(r.a().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            O2.a.a(i.class, th);
            return null;
        }
    }

    public String c(String str) {
        List list;
        int i9;
        boolean z8;
        if (O2.a.b(this)) {
            return null;
        }
        try {
            j.e(str, "str");
            int length = str.length() - 1;
            int i10 = 0;
            boolean z9 = false;
            while (i10 <= length) {
                if (!z9) {
                    i9 = i10;
                } else {
                    i9 = length;
                }
                if (j.f(str.charAt(i9), 32) <= 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z9) {
                    if (!z8) {
                        z9 = true;
                    } else {
                        i10++;
                    }
                } else {
                    if (!z8) {
                        break;
                    }
                    length--;
                }
            }
            String obj = str.subSequence(i10, length + 1).toString();
            Pattern compile = Pattern.compile("\\s+");
            j.d(compile, "compile(...)");
            j.e(obj, "input");
            O7.g.S(0);
            Matcher matcher = compile.matcher(obj);
            if (!matcher.find()) {
                list = android.support.v4.media.session.a.w(obj.toString());
            } else {
                ArrayList arrayList = new ArrayList(10);
                int i11 = 0;
                do {
                    arrayList.add(obj.subSequence(i11, matcher.start()).toString());
                    i11 = matcher.end();
                } while (matcher.find());
                arrayList.add(obj.subSequence(i11, obj.length()).toString());
                list = arrayList;
            }
            Object[] array = list.toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                j.d(join, "join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public int[] d(String str) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            j.e(str, "texts");
            int[] iArr = new int[128];
            String c9 = c(str);
            Charset forName = Charset.forName("UTF-8");
            j.d(forName, "forName(\"UTF-8\")");
            if (c9 != null) {
                byte[] bytes = c9.getBytes(forName);
                j.d(bytes, "(this as java.lang.String).getBytes(charset)");
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    if (i9 < bytes.length) {
                        iArr[i9] = bytes[i9] & 255;
                    } else {
                        iArr[i9] = 0;
                    }
                    if (i10 >= 128) {
                        return iArr;
                    }
                    i9 = i10;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }
}
