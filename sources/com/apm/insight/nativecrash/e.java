package com.apm.insight.nativecrash;

import com.apm.insight.l.o;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class e {

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f5967i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f5968j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f5969k = Pattern.compile("^Abort message: (.*)$");
    private static final Pattern l = Pattern.compile("^Crash message: (.*)$");
    private static final Pattern m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* renamed from: a, reason: collision with root package name */
    private String f5970a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f5971c;

    /* renamed from: d, reason: collision with root package name */
    private String f5972d;

    /* renamed from: e, reason: collision with root package name */
    private String f5973e;

    /* renamed from: f, reason: collision with root package name */
    private String f5974f;

    /* renamed from: g, reason: collision with root package name */
    private String f5975g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, String> f5976h = new HashMap();

    public e(File file) {
        c(o.b(file));
    }

    public String a() {
        return this.f5975g;
    }

    public Map<String, String> b() {
        return this.f5976h;
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        String str = this.f5973e;
        if (str != null) {
            sb.append(str);
        }
        String str2 = this.f5974f;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.f5975g;
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0190, code lost:
    
        r12 = r3.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0194, code lost:
    
        if (r12 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019c, code lost:
    
        if (r12.contains("BuildId:") != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019f, code lost:
    
        r12 = com.apm.insight.nativecrash.e.m.matcher(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a9, code lost:
    
        if (r12.find() != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ac, code lost:
    
        r0 = r12.group(1);
        r1 = r12.group(2);
        r12 = r12.group(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01be, code lost:
    
        if (r0.equals(com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource.SCHEME_DATA) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c0, code lost:
    
        r11.f5976h.put(r1, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(java.io.File r12) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.e.c(java.io.File):void");
    }

    public void a(File file) {
        File b = o.b(file);
        if (b.exists()) {
            b.renameTo(new File(b.getAbsoluteFile() + ".old"));
        }
        NativeImpl.a(file);
        c(o.b(file));
    }

    public void b(File file) {
        c(o.b(file));
    }
}
