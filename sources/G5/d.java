package G5;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f1278a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f1279c;

    /* renamed from: d, reason: collision with root package name */
    public String f1280d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1281e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1282f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1283g;

    public d(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i9 = 0; i9 < length; i9++) {
            char c9 = (char) (bytes[i9] & 255);
            if (c9 == '?' && str.charAt(i9) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c9);
        }
        this.f1280d = sb.toString();
        this.f1281e = g.b;
        this.f1282f = new StringBuilder(str.length());
        this.b = -1;
    }

    public char a() {
        return this.f1280d.charAt(this.f1278a);
    }

    public boolean b() {
        if (this.f1278a < this.f1280d.length() - this.f1279c) {
            return true;
        }
        return false;
    }

    public void c(int i9, boolean z8) {
        if (z8) {
            this.f1279c = i9 | this.f1279c;
        } else {
            this.f1279c = (~i9) & this.f1279c;
        }
    }

    public void d(int i9) {
        f fVar = (f) this.f1283g;
        if (fVar == null || i9 > fVar.b) {
            this.f1283g = f.e(i9, (g) this.f1281e);
        }
    }

    public void e(char c9) {
        ((StringBuilder) this.f1282f).append(c9);
    }

    public d(PendingIntent pendingIntent, IconCompat iconCompat) {
        if (pendingIntent != null) {
            this.f1281e = pendingIntent;
            this.f1282f = iconCompat;
            return;
        }
        throw new NullPointerException("Bubble requires non-null pending intent");
    }
}
