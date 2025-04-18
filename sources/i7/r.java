package i7;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class r implements q {

    /* renamed from: e, reason: collision with root package name */
    public static volatile j f19193e;
    public final q7.a a;

    /* renamed from: b, reason: collision with root package name */
    public final q7.a f19194b;

    /* renamed from: c, reason: collision with root package name */
    public final m7.b f19195c;

    /* renamed from: d, reason: collision with root package name */
    public final n7.i f19196d;

    public r(q7.a aVar, q7.a aVar2, m7.b bVar, n7.i iVar, n7.k kVar) {
        this.a = aVar;
        this.f19194b = aVar2;
        this.f19195c = bVar;
        this.f19196d = iVar;
        kVar.getClass();
        kVar.a.execute(new androidx.activity.d(kVar, 26));
    }

    public static r a() {
        j jVar = f19193e;
        if (jVar != null) {
            return (r) jVar.f19185h.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f19193e == null) {
            synchronized (r.class) {
                if (f19193e == null) {
                    k4.i iVar = new k4.i(0);
                    context.getClass();
                    iVar.f20241c = context;
                    f19193e = new j(context);
                }
            }
        }
    }

    public final o c(g7.a aVar) {
        Set singleton;
        byte[] bytes;
        if (aVar instanceof k) {
            aVar.getClass();
            singleton = Collections.unmodifiableSet(g7.a.f18229d);
        } else {
            singleton = Collections.singleton(new f7.c("proto"));
        }
        h.c a = i.a();
        aVar.getClass();
        a.G("cct");
        String str = aVar.a;
        String str2 = aVar.f18232b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            Object[] objArr = new Object[4];
            objArr[0] = "1$";
            objArr[1] = str;
            objArr[2] = "\\";
            if (str2 == null) {
                str2 = "";
            }
            objArr[3] = str2;
            bytes = String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
        }
        a.f18524d = bytes;
        return new o(singleton, a.o(), this);
    }
}
