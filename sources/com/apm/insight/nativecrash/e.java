package com.apm.insight.nativecrash;

import com.apm.insight.l.n;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class e {

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f3266i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f3267j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f3268k = Pattern.compile("^Abort message: (.*)$");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f3269l = Pattern.compile("^Crash message: (.*)$");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f3270m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f3271b;

    /* renamed from: c, reason: collision with root package name */
    private String f3272c;

    /* renamed from: d, reason: collision with root package name */
    private String f3273d;

    /* renamed from: e, reason: collision with root package name */
    private String f3274e;

    /* renamed from: f, reason: collision with root package name */
    private String f3275f;

    /* renamed from: g, reason: collision with root package name */
    private String f3276g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, String> f3277h = new HashMap();

    public e(File file) {
        c(n.b(file));
    }

    public String a() {
        return this.f3276g;
    }

    public Map<String, String> b() {
        return this.f3277h;
    }

    public String c() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f3274e;
        if (str != null) {
            sb2.append(str);
        }
        String str2 = this.f3275f;
        if (str2 != null) {
            sb2.append(str2);
        }
        String str3 = this.f3276g;
        if (str3 != null) {
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x018c, code lost:
    
        r12 = r3.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0190, code lost:
    
        if (r12 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0198, code lost:
    
        if (r12.contains("BuildId:") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019b, code lost:
    
        r12 = com.apm.insight.nativecrash.e.f3270m.matcher(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a5, code lost:
    
        if (r12.find() != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r0 = r12.group(1);
        r1 = r12.group(2);
        r12 = r12.group(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ba, code lost:
    
        if (r0.equals(com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource.SCHEME_DATA) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01bc, code lost:
    
        r11.f3277h.put(r1, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(java.io.File r12) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.e.c(java.io.File):void");
    }

    public void a(File file) {
        File b3 = n.b(file);
        if (b3.exists()) {
            b3.renameTo(new File(b3.getAbsoluteFile() + ".old"));
        }
        NativeImpl.a(file);
        c(n.b(file));
    }

    public void b(File file) {
        c(n.b(file));
    }
}
