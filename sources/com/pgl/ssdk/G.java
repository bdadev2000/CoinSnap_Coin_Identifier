package com.pgl.ssdk;

import android.content.Context;
import java.net.HttpURLConnection;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class G {
    private String a;

    /* renamed from: c, reason: collision with root package name */
    private int f16509c;

    /* renamed from: d, reason: collision with root package name */
    private int f16510d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f16511e;

    /* renamed from: b, reason: collision with root package name */
    public String f16508b = "";

    /* renamed from: f, reason: collision with root package name */
    private int f16512f = -1;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f16513g = null;

    /* renamed from: h, reason: collision with root package name */
    private int f16514h = 10000;

    /* renamed from: i, reason: collision with root package name */
    private int f16515i = 2;

    /* renamed from: j, reason: collision with root package name */
    private int f16516j = 0;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16517k = false;

    /* renamed from: l, reason: collision with root package name */
    private HttpURLConnection f16518l = null;

    /* renamed from: m, reason: collision with root package name */
    private Runnable f16519m = new a();

    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!G.this.a() && G.this.f16516j < G.this.f16515i) {
                G.c(G.this);
                Q b3 = M.a().b();
                if (b3 != null) {
                    b3.post(this);
                }
            }
        }
    }

    public G(Context context, String str) {
        this.a = (str == null || str.length() <= 0) ? "" : str;
    }

    public static /* synthetic */ int c(G g10) {
        int i10 = g10.f16516j;
        g10.f16516j = i10 + 1;
        return i10;
    }

    public abstract boolean a(int i10, byte[] bArr);

    private void a(int i10) {
        String str = i10 != 1 ? i10 != 2 ? "" : "application/octet-stream" : "application/json; charset=utf-8";
        if (str.length() > 0) {
            this.f16518l.addRequestProperty("Content-Type", str);
        }
        this.f16518l.addRequestProperty("Cookie", "sessionid=" + this.a);
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                this.f16518l.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9");
                return;
            }
            this.f16518l.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        r1.disconnect();
        r8.f16518l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if (r2 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.G.a():boolean");
    }

    public void a(int i10, int i11, byte[] bArr) {
        Q b3;
        this.f16509c = i10;
        this.f16510d = i11;
        this.f16511e = bArr;
        Runnable runnable = this.f16519m;
        if (runnable == null || (b3 = M.a().b()) == null) {
            return;
        }
        b3.post(runnable);
    }
}
