package ob;

import a4.y;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.z;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.plantcare.ai.identifier.plantid.R;
import db.g;
import db.s;
import db.t;
import eb.j;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import jb.i;
import jb.r;
import jb.w;
import jb.x;
import k8.f;
import lb.d;
import lb.e;
import lb.n;
import lb.o;
import m2.l;
import mb.a0;
import mb.b0;
import mb.e1;
import mb.h1;
import mb.i1;
import mb.k0;
import mb.l1;
import mb.o0;
import mb.o2;
import mb.p0;
import mb.q0;
import mb.r0;

/* loaded from: classes3.dex */
public final class c implements db.b {
    public Object a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23292b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23293c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23294d;

    /* renamed from: e, reason: collision with root package name */
    public Object f23295e;

    /* renamed from: f, reason: collision with root package name */
    public Object f23296f;

    /* renamed from: g, reason: collision with root package name */
    public Object f23297g;

    public c() {
    }

    public static p0 h(p0 p0Var, e eVar, c cVar) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        o0 o0Var = new o0(p0Var);
        String e2 = eVar.f21306b.e();
        if (e2 != null) {
            new a4.b().a = e2;
            o0Var.f22036e = new h1(e2);
        } else {
            b6.a.f2288f.h("No log data to include with this event.");
        }
        d dVar = (d) ((AtomicMarkableReference) ((h3.a) cVar.f23294d).f18723d).getReference();
        synchronized (dVar) {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(dVar.a));
        }
        List p10 = p(unmodifiableMap);
        d dVar2 = (d) ((AtomicMarkableReference) ((h3.a) cVar.f23295e).f18723d).getReference();
        synchronized (dVar2) {
            unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(dVar2.a));
        }
        List p11 = p(unmodifiableMap2);
        if (!p10.isEmpty() || !p11.isEmpty()) {
            r0 r0Var = (r0) p0Var.f22043c;
            r0Var.getClass();
            q0 q0Var = new q0(r0Var);
            q0Var.f22054b = p10;
            q0Var.f22055c = p11;
            o0Var.f22034c = q0Var.a();
        }
        return o0Var.a();
    }

    public static o2 i(p0 p0Var, c cVar) {
        List a = ((o) cVar.f23296f).a();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < a.size(); i10++) {
            n nVar = (n) a.get(i10);
            nVar.getClass();
            i1 i1Var = new i1();
            y yVar = new y(4);
            lb.b bVar = (lb.b) nVar;
            String str = bVar.f21301e;
            if (str != null) {
                yVar.f171c = str;
                String str2 = bVar.f21298b;
                if (str2 != null) {
                    yVar.f170b = str2;
                    i1Var.a = yVar.c();
                    String str3 = bVar.f21299c;
                    if (str3 != null) {
                        i1Var.f21949b = str3;
                        String str4 = bVar.f21300d;
                        if (str4 != null) {
                            i1Var.f21950c = str4;
                            i1Var.f21951d = bVar.f21302f;
                            i1Var.f21952e = (byte) (i1Var.f21952e | 1);
                            arrayList.add(i1Var.a());
                        } else {
                            throw new NullPointerException("Null parameterValue");
                        }
                    } else {
                        throw new NullPointerException("Null parameterKey");
                    }
                } else {
                    throw new NullPointerException("Null rolloutId");
                }
            } else {
                throw new NullPointerException("Null variantId");
            }
        }
        if (arrayList.isEmpty()) {
            return p0Var;
        }
        o0 o0Var = new o0(p0Var);
        new androidx.viewpager2.adapter.c(2).f2129b = arrayList;
        o0Var.f22037f = new l1(arrayList);
        return o0Var.a();
    }

    public static c m(Context context, x xVar, c cVar, android.support.v4.media.d dVar, e eVar, c cVar2, f0.c cVar3, l lVar, qa.a aVar, i iVar, kb.d dVar2) {
        r rVar = new r(context, xVar, dVar, cVar3, lVar);
        a aVar2 = new a(cVar, lVar, iVar);
        nb.c cVar4 = pb.a.f23561b;
        i7.r.b(context);
        return new c(rVar, aVar2, new pb.a(new pb.c(i7.r.a().c(new g7.a(pb.a.f23562c, pb.a.f23563d)).a("FIREBASE_CRASHLYTICS_REPORT", new f7.c("json"), pb.a.f23564e), lVar.f(), aVar)), eVar, cVar2, xVar, dVar2);
    }

    public static List p(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            y yVar = new y(3);
            String str = (String) entry.getKey();
            if (str != null) {
                yVar.f170b = str;
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    yVar.f171c = str2;
                    arrayList.add(yVar.b());
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new k0.b(26));
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized void q(File file) {
        synchronized (c.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                b6.a.f2288f.d("Unexpected non-directory file: " + file + "; deleting file and creating new directory.", null);
                file.delete();
            }
            if (!file.mkdirs()) {
                b6.a.f2288f.e("Could not create Crashlytics-specific directory: " + file, null);
            }
        }
    }

    public static boolean r(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                r(file2);
            }
        }
        return file.delete();
    }

    public static List s(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    @Override // db.b
    public final cc.c a(s sVar) {
        if (((Set) this.f23292b).contains(sVar)) {
            return ((db.b) this.f23297g).a(sVar);
        }
        throw new z(String.format("Attempting to request an undeclared dependency Provider<%s>.", sVar));
    }

    @Override // db.b
    public final Object b(Class cls) {
        if (((Set) this.a).contains(s.a(cls))) {
            Object b3 = ((db.b) this.f23297g).b(cls);
            if (!cls.equals(zb.b.class)) {
                return b3;
            }
            return new t();
        }
        throw new z(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // db.b
    public final Set c(s sVar) {
        if (((Set) this.f23294d).contains(sVar)) {
            return ((db.b) this.f23297g).c(sVar);
        }
        throw new z(String.format("Attempting to request an undeclared dependency Set<%s>.", sVar));
    }

    @Override // db.b
    public final cc.c d(Class cls) {
        return a(s.a(cls));
    }

    @Override // db.b
    public final Object e(s sVar) {
        if (((Set) this.a).contains(sVar)) {
            return ((db.b) this.f23297g).e(sVar);
        }
        throw new z(String.format("Attempting to request an undeclared dependency %s.", sVar));
    }

    @Override // db.b
    public final cc.b f(s sVar) {
        if (((Set) this.f23293c).contains(sVar)) {
            return ((db.b) this.f23297g).f(sVar);
        }
        throw new z(String.format("Attempting to request an undeclared dependency Deferred<%s>.", sVar));
    }

    @Override // db.b
    public final cc.c g(s sVar) {
        if (((Set) this.f23295e).contains(sVar)) {
            return ((db.b) this.f23297g).g(sVar);
        }
        throw new z(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", sVar));
    }

    public final ec.a j() {
        String str;
        if (((ec.c) this.f23292b) == null) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.f23295e) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f23296f) == null) {
            str = j.k(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new ec.a((String) this.a, (ec.c) this.f23292b, (String) this.f23293c, (String) this.f23294d, ((Long) this.f23295e).longValue(), ((Long) this.f23296f).longValue(), (String) this.f23297g);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final k0 k() {
        String str;
        String str2 = (String) this.a;
        if (str2 != null && (str = (String) this.f23292b) != null) {
            String str3 = (String) this.f23293c;
            a4.j.t(this.f23294d);
            return new k0(str2, str, str3, (String) this.f23295e, (String) this.f23296f, (String) this.f23297g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (((String) this.a) == null) {
            sb2.append(" identifier");
        }
        if (((String) this.f23292b) == null) {
            sb2.append(" version");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }

    public final void l(String str) {
        File file = new File((File) this.f23292b, str);
        if (file.exists() && r(file)) {
            b6.a.f2288f.d("Deleted previous Crashlytics file system: " + file.getPath(), null);
        }
    }

    public final cc.b n(Class cls) {
        return f(s.a(cls));
    }

    public final File o(String str, String str2) {
        File file = new File((File) this.f23294d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public final Task t(String str, kb.a aVar) {
        boolean z10;
        TaskCompletionSource taskCompletionSource;
        ArrayList b3 = ((a) this.f23292b).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b3.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                nb.c cVar = a.f23286g;
                String d10 = a.d(file);
                cVar.getClass();
                arrayList.add(new jb.a(nb.c.i(d10), file.getName(), file));
            } catch (IOException e2) {
                b6.a.f2288f.i("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            jb.a aVar2 = (jb.a) it2.next();
            if (str == null || str.equals(aVar2.f19873b)) {
                pb.a aVar3 = (pb.a) this.f23293c;
                b0 b0Var = (b0) aVar2.a;
                int i10 = 1;
                if (b0Var.f21846f == null || b0Var.f21847g == null) {
                    w b10 = ((x) this.f23296f).b(true);
                    b0 b0Var2 = (b0) aVar2.a;
                    b0Var2.getClass();
                    a0 a0Var = new a0(b0Var2);
                    a0Var.f21822e = b10.a;
                    a0 a0Var2 = new a0(a0Var.a());
                    a0Var2.f21823f = b10.f19965b;
                    aVar2 = new jb.a(a0Var2.a(), aVar2.f19873b, aVar2.f19874c);
                }
                boolean z11 = false;
                if (str != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pb.c cVar2 = aVar3.a;
                synchronized (cVar2.f23573f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) cVar2.f23576i.f23736c).getAndIncrement();
                            if (cVar2.f23573f.size() < cVar2.f23572e) {
                                z11 = true;
                            }
                            if (z11) {
                                b6.a aVar4 = b6.a.f2288f;
                                aVar4.d("Enqueueing report: " + aVar2.f19873b, null);
                                aVar4.d("Queue size: " + cVar2.f23573f.size(), null);
                                cVar2.f23574g.execute(new k0.a(cVar2, aVar2, taskCompletionSource));
                                aVar4.d("Closing task for report: " + aVar2.f19873b, null);
                                taskCompletionSource.trySetResult(aVar2);
                            } else {
                                cVar2.a();
                                b6.a.f2288f.d("Dropping report due to queue being full: " + aVar2.f19873b, null);
                                ((AtomicInteger) cVar2.f23576i.f23737d).getAndIncrement();
                                taskCompletionSource.trySetResult(aVar2);
                            }
                        } else {
                            cVar2.b(aVar2, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(aVar, new gb.d(this, i10)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }

    public final void u(String str) {
        h3.a aVar = (h3.a) this.f23295e;
        synchronized (aVar) {
            if (((d) ((AtomicMarkableReference) aVar.f18723d).getReference()).b(str)) {
                Object obj = aVar.f18723d;
                boolean z10 = true;
                ((AtomicMarkableReference) obj).set((d) ((AtomicMarkableReference) obj).getReference(), true);
                f fVar = new f(aVar, 9);
                AtomicReference atomicReference = (AtomicReference) aVar.f18724f;
                while (true) {
                    if (atomicReference.compareAndSet(null, fVar)) {
                        break;
                    } else if (atomicReference.get() != null) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    ((kb.d) ((c) aVar.f18725g).f23293c).f20634b.a(fVar);
                }
            }
        }
    }

    public final void v(ec.c cVar) {
        if (cVar != null) {
            this.f23292b = cVar;
            return;
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public c(ec.a aVar) {
        this.a = aVar.a;
        this.f23292b = aVar.f17292b;
        this.f23293c = aVar.f17293c;
        this.f23294d = aVar.f17294d;
        this.f23295e = Long.valueOf(aVar.f17295e);
        this.f23296f = Long.valueOf(aVar.f17296f);
        this.f23297g = aVar.f17297g;
    }

    public c(db.a aVar, g gVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (db.j jVar : aVar.f16940c) {
            int i10 = jVar.f16957c;
            boolean z10 = i10 == 0;
            int i11 = jVar.f16956b;
            s sVar = jVar.a;
            if (z10) {
                if (i11 == 2) {
                    hashSet4.add(sVar);
                } else {
                    hashSet.add(sVar);
                }
            } else if (i10 == 2) {
                hashSet3.add(sVar);
            } else if (i11 == 2) {
                hashSet5.add(sVar);
            } else {
                hashSet2.add(sVar);
            }
        }
        Set set = aVar.f16944g;
        if (!set.isEmpty()) {
            hashSet.add(s.a(zb.b.class));
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.f23292b = Collections.unmodifiableSet(hashSet2);
        this.f23293c = Collections.unmodifiableSet(hashSet3);
        this.f23294d = Collections.unmodifiableSet(hashSet4);
        this.f23295e = Collections.unmodifiableSet(hashSet5);
        this.f23296f = set;
        this.f23297g = gVar;
    }

    public c(Context context, int i10) {
        String str;
        String replaceAll;
        if (i10 != 1) {
            this.a = ((e1) b6.b.f2296h.g(context)).a;
            this.f23292b = context.getFilesDir();
            if (!((String) this.a).isEmpty()) {
                StringBuilder sb2 = new StringBuilder(".crashlytics.v3");
                sb2.append(File.separator);
                String str2 = (String) this.a;
                if (str2.length() > 40) {
                    replaceAll = jb.g.E(str2);
                } else {
                    replaceAll = str2.replaceAll("[^a-zA-Z0-9.]", "_");
                }
                sb2.append(replaceAll);
                str = sb2.toString();
            } else {
                str = ".com.google.firebase.crashlytics.files.v1";
            }
            File file = new File((File) this.f23292b, str);
            q(file);
            this.f23293c = file;
            File file2 = new File((File) this.f23293c, "open-sessions");
            q(file2);
            this.f23294d = file2;
            File file3 = new File((File) this.f23293c, "reports");
            q(file3);
            this.f23295e = file3;
            File file4 = new File((File) this.f23293c, "priority-reports");
            q(file4);
            this.f23296f = file4;
            File file5 = new File((File) this.f23293c, "native-reports");
            q(file5);
            this.f23297g = file5;
            return;
        }
        this.f23294d = new WindowManager.LayoutParams();
        this.f23295e = new Rect();
        this.f23296f = new int[2];
        this.f23297g = new int[2];
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f23292b = inflate;
        this.f23293c = (TextView) inflate.findViewById(R.id.message);
        ((WindowManager.LayoutParams) this.f23294d).setTitle(c.class.getSimpleName());
        ((WindowManager.LayoutParams) this.f23294d).packageName = ((Context) this.a).getPackageName();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.f23294d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public c(String str, c cVar, kb.d dVar) {
        this.f23294d = new h3.a(this, false);
        this.f23295e = new h3.a(this, true);
        this.f23296f = new o(0);
        this.f23297g = new AtomicMarkableReference(null, false);
        this.a = str;
        this.f23292b = new lb.g(cVar);
        this.f23293c = dVar;
    }

    public c(r rVar, a aVar, pb.a aVar2, e eVar, c cVar, x xVar, kb.d dVar) {
        this.a = rVar;
        this.f23292b = aVar;
        this.f23293c = aVar2;
        this.f23294d = eVar;
        this.f23295e = cVar;
        this.f23296f = xVar;
        this.f23297g = dVar;
    }

    public c(j4.e eVar, j4.e eVar2, j4.e eVar3, j4.e eVar4, g4.w wVar, g4.y yVar) {
        this.f23297g = p6.a.w(150, new kc.c(this, 18));
        this.a = eVar;
        this.f23292b = eVar2;
        this.f23293c = eVar3;
        this.f23294d = eVar4;
        this.f23295e = wVar;
        this.f23296f = yVar;
    }
}
