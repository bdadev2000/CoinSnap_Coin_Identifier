package com.pgl.ssdk;

import android.content.Context;
import java.net.HttpURLConnection;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    private String f19526a;

    /* renamed from: c, reason: collision with root package name */
    private int f19527c;

    /* renamed from: d, reason: collision with root package name */
    private int f19528d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f19529e;
    public String b = "";

    /* renamed from: f, reason: collision with root package name */
    private int f19530f = -1;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f19531g = null;

    /* renamed from: h, reason: collision with root package name */
    private int f19532h = 10000;

    /* renamed from: i, reason: collision with root package name */
    private int f19533i = 2;

    /* renamed from: j, reason: collision with root package name */
    private int f19534j = 0;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19535k = false;
    private HttpURLConnection l = null;
    private Runnable m = new a();

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!F.this.a() && F.this.f19534j < F.this.f19533i) {
                F.c(F.this);
                P b = L.a().b();
                if (b != null) {
                    b.post(this);
                }
            }
        }
    }

    public F(Context context, String str) {
        this.f19526a = (str == null || str.length() <= 0) ? "" : str;
    }

    public static /* synthetic */ int c(F f9) {
        int i9 = f9.f19534j;
        f9.f19534j = i9 + 1;
        return i9;
    }

    public abstract boolean a(int i9, byte[] bArr);

    private void a(int i9) {
        String str = i9 != 1 ? i9 != 2 ? "" : "application/octet-stream" : "application/json; charset=utf-8";
        if (str.length() > 0) {
            this.l.addRequestProperty("Content-Type", str);
        }
        this.l.addRequestProperty("Cookie", "sessionid=" + this.f19526a);
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                this.l.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9");
                return;
            }
            this.l.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        if (r1 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        r1.disconnect();
        r8.l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        if (r2 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.F.a():boolean");
    }

    public void a(int i9, int i10, byte[] bArr) {
        P b;
        this.f19527c = i9;
        this.f19528d = i10;
        this.f19529e = bArr;
        Runnable runnable = this.m;
        if (runnable == null || (b = L.a().b()) == null) {
            return;
        }
        b.post(runnable);
    }
}
