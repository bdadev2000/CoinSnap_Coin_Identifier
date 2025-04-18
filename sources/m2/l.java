package m2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.collect.c1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import jb.t;
import org.json.JSONObject;
import y7.q;

/* loaded from: classes.dex */
public final class l implements o5.a {
    public Object a;

    /* renamed from: b, reason: collision with root package name */
    public Object f21467b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21468c;

    /* renamed from: d, reason: collision with root package name */
    public Object f21469d;

    /* renamed from: e, reason: collision with root package name */
    public Object f21470e;

    /* renamed from: f, reason: collision with root package name */
    public Object f21471f;

    /* renamed from: g, reason: collision with root package name */
    public Object f21472g;

    /* renamed from: h, reason: collision with root package name */
    public Object f21473h;

    /* renamed from: i, reason: collision with root package name */
    public Object f21474i;

    public l(int i10) {
        if (i10 != 2) {
            this.a = "video_reward_full";
            this.f21467b = "video_brand";
            this.f21468c = "video_splash";
            this.f21469d = "video_default";
            this.f21470e = null;
            this.f21471f = null;
            this.f21472g = null;
            this.f21473h = null;
            this.f21474i = null;
        }
    }

    public static HashSet b() {
        p5.c cVar;
        p5.c cVar2;
        HashSet hashSet = new HashSet();
        for (f5.a aVar : f5.a.f17676g.values()) {
            if (aVar != null && (cVar2 = aVar.f17680f) != null) {
                hashSet.add(com.bumptech.glide.d.a(cVar2.Sg(), cVar2.pDU()).getAbsolutePath());
                hashSet.add(com.bumptech.glide.d.G(cVar2.Sg(), cVar2.pDU()).getAbsolutePath());
            }
        }
        for (g5.a aVar2 : g5.b.a.values()) {
            if (aVar2 != null && (cVar = aVar2.f18196b) != null) {
                hashSet.add(com.bumptech.glide.d.a(cVar.Sg(), cVar.pDU()).getAbsolutePath());
                hashSet.add(com.bumptech.glide.d.G(cVar.Sg(), cVar.pDU()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    public final synchronized void a() {
        Iterator it = h().iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            o5.b bVar = (o5.b) it.next();
            File[] fileArr = bVar.a;
            if (fileArr != null && fileArr.length >= bVar.f23134b) {
                if (hashSet == null) {
                    hashSet = b();
                }
                int i10 = bVar.f23134b - 2;
                if (i10 < 0) {
                    i10 = 0;
                }
                File[] fileArr2 = bVar.a;
                if (i10 >= 0 && fileArr2 != null) {
                    try {
                        if (fileArr2.length > i10) {
                            List asList = Arrays.asList(fileArr2);
                            Collections.sort(asList, new b0.g(3));
                            while (i10 < asList.size()) {
                                if (!hashSet.contains(((File) asList.get(i10)).getAbsolutePath())) {
                                    ((File) asList.get(i10)).delete();
                                }
                                i10++;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public final String c() {
        if (((String) this.f21473h) == null) {
            this.f21473h = ((String) this.f21470e) + File.separator + ((String) this.f21468c);
            File file = new File((String) this.f21473h);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return (String) this.f21473h;
    }

    public final String d() {
        if (((String) this.f21471f) == null) {
            this.f21471f = ((String) this.f21470e) + File.separator + ((String) this.a);
            File file = new File((String) this.f21471f);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return (String) this.f21471f;
    }

    public final qb.a e(int i10) {
        boolean z10;
        b6.a aVar = b6.a.f2288f;
        qb.a aVar2 = null;
        try {
            if (!t.h.a(2, i10)) {
                JSONObject j3 = ((hb.d) this.f21471f).j();
                if (j3 != null) {
                    qb.a e2 = ((q) this.f21469d).e(j3);
                    if (e2 != null) {
                        aVar.d("Loaded cached settings: " + j3.toString(), null);
                        ((ni.a) this.f21470e).getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!t.h.a(3, i10)) {
                            if (e2.f23739c < currentTimeMillis) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                aVar.h("Cached settings have expired.");
                            }
                        }
                        try {
                            aVar.h("Returning cached settings.");
                            aVar2 = e2;
                        } catch (Exception e10) {
                            e = e10;
                            aVar2 = e2;
                            aVar.e("Failed to get cached settings", e);
                            return aVar2;
                        }
                    } else {
                        aVar.e("Failed to parse cached settings data.", null);
                    }
                } else {
                    aVar.d("No cached settings data found.", null);
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return aVar2;
    }

    public final qb.a f() {
        return (qb.a) ((AtomicReference) this.f21473h).get();
    }

    public final String g() {
        if (((String) this.f21474i) == null) {
            this.f21474i = ((String) this.f21470e) + File.separator + ((String) this.f21469d);
            File file = new File((String) this.f21474i);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return (String) this.f21474i;
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o5.b(new File(d()).listFiles(), c6.k.f2656p));
        arrayList.add(new o5.b(new File(c()).listFiles(), c6.k.f2655o));
        if (((String) this.f21472g) == null) {
            this.f21472g = ((String) this.f21470e) + File.separator + ((String) this.f21467b);
            File file = new File((String) this.f21472g);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        arrayList.add(new o5.b(new File((String) this.f21472g).listFiles(), c6.k.f2657q));
        arrayList.add(new o5.b(new File(g()).listFiles(), c6.k.f2658r));
        return arrayList;
    }

    public l(Context context, qb.d dVar, ni.a aVar, q qVar, hb.d dVar2, c1 c1Var, t tVar) {
        this.f21473h = new AtomicReference();
        this.f21474i = new AtomicReference(new TaskCompletionSource());
        this.f21467b = context;
        this.f21468c = dVar;
        this.f21470e = aVar;
        this.f21469d = qVar;
        this.f21471f = dVar2;
        this.f21472g = c1Var;
        this.a = tVar;
        ((AtomicReference) this.f21473h).set(com.facebook.internal.m.j(aVar));
    }

    public l(Context context, androidx.work.b bVar, x2.a aVar, t2.a aVar2, WorkDatabase workDatabase, String str) {
        this.f21474i = new h.c(9, 0);
        this.f21467b = context.getApplicationContext();
        this.f21470e = aVar;
        this.f21469d = aVar2;
        this.f21471f = bVar;
        this.f21472g = workDatabase;
        this.a = str;
    }
}
