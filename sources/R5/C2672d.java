package r5;

import e0.InterfaceC2208i;
import java.util.regex.Pattern;
import p5.C2551b;
import t7.AbstractC2712a;
import t7.C2724m;

/* renamed from: r5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2672d implements o {

    /* renamed from: a, reason: collision with root package name */
    public final O4.e f22854a;
    public final C2551b b;

    /* renamed from: c, reason: collision with root package name */
    public final l5.k f22855c;

    /* renamed from: d, reason: collision with root package name */
    public final C2724m f22856d;

    /* renamed from: e, reason: collision with root package name */
    public final Y7.d f22857e = new Y7.d(false);

    public C2672d(w7.k kVar, O4.e eVar, C2551b c2551b, l5.k kVar2, InterfaceC2208i interfaceC2208i) {
        this.f22854a = eVar;
        this.b = c2551b;
        this.f22855c = kVar2;
        this.f22856d = AbstractC2712a.d(new a8.e(interfaceC2208i, 5));
    }

    public static String f(String str) {
        Pattern compile = Pattern.compile("/");
        G7.j.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        G7.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @Override // r5.o
    public final Boolean a() {
        C2674f c2674f = e().b;
        if (c2674f != null) {
            return c2674f.f22863a;
        }
        G7.j.k("sessionConfigs");
        throw null;
    }

    @Override // r5.o
    public final P7.a b() {
        C2674f c2674f = e().b;
        if (c2674f != null) {
            Integer num = c2674f.f22864c;
            if (num == null) {
                return null;
            }
            int i9 = P7.a.f2440f;
            return new P7.a(r8.k.C(num.intValue(), P7.c.SECONDS));
        }
        G7.j.k("sessionConfigs");
        throw null;
    }

    @Override // r5.o
    public final Double c() {
        C2674f c2674f = e().b;
        if (c2674f != null) {
            return c2674f.b;
        }
        G7.j.k("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:25:0x004c, B:26:0x00a9, B:28:0x00b5, B:31:0x00bb, B:38:0x0083, B:40:0x008d, B:41:0x0098), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:25:0x004c, B:26:0x00a9, B:28:0x00b5, B:31:0x00bb, B:38:0x0083, B:40:0x008d, B:41:0x0098), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:25:0x004c, B:26:0x00a9, B:28:0x00b5, B:31:0x00bb, B:38:0x0083, B:40:0x008d, B:41:0x0098), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {all -> 0x0050, blocks: (B:25:0x004c, B:26:0x00a9, B:28:0x00b5, B:31:0x00bb, B:38:0x0083, B:40:0x008d, B:41:0x0098), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r15v2, types: [r5.c, y7.i] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // r5.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(w7.f r18) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.C2672d.d(w7.f):java.lang.Object");
    }

    public final n e() {
        return (n) this.f22856d.getValue();
    }
}
