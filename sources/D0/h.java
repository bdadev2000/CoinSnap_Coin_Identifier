package D0;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h {
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f605c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f606d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f607e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f608f;

    /* renamed from: g, reason: collision with root package name */
    public H0.c f609g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f610h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f612j;

    /* renamed from: k, reason: collision with root package name */
    public final i f613k;
    public HashSet l;

    /* renamed from: a, reason: collision with root package name */
    public final Class f604a = WorkDatabase.class;

    /* renamed from: i, reason: collision with root package name */
    public boolean f611i = true;

    /* JADX WARN: Type inference failed for: r1v3, types: [D0.i, java.lang.Object] */
    public h(Context context, String str) {
        this.f605c = context;
        this.b = str;
        ?? obj = new Object();
        obj.f614a = new HashMap();
        this.f613k = obj;
    }

    public final void a(E0.a... aVarArr) {
        if (this.l == null) {
            this.l = new HashSet();
        }
        for (E0.a aVar : aVarArr) {
            this.l.add(Integer.valueOf(aVar.f967a));
            this.l.add(Integer.valueOf(aVar.b));
        }
        i iVar = this.f613k;
        iVar.getClass();
        for (E0.a aVar2 : aVarArr) {
            int i9 = aVar2.f967a;
            HashMap hashMap = iVar.f614a;
            TreeMap treeMap = (TreeMap) hashMap.get(Integer.valueOf(i9));
            if (treeMap == null) {
                treeMap = new TreeMap();
                hashMap.put(Integer.valueOf(i9), treeMap);
            }
            int i10 = aVar2.b;
            E0.a aVar3 = (E0.a) treeMap.get(Integer.valueOf(i10));
            if (aVar3 != null) {
                Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
            }
            treeMap.put(Integer.valueOf(i10), aVar2);
        }
    }
}
