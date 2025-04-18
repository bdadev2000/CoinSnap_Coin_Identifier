package y7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.collect.c1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.otaliastudios.cameraview.CameraView;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class q implements n9.z, uc.n, od.b, SuccessContinuation {

    /* renamed from: b, reason: collision with root package name */
    public Object f27991b;

    public /* synthetic */ q(Object obj) {
        this.f27991b = obj;
    }

    @Override // od.b
    public final JSONObject a(View view) {
        if (view == null) {
            return qd.c.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen((int[]) this.f27991b);
        int[] iArr = (int[]) this.f27991b;
        return qd.c.a(iArr[0], iArr[1], width, height);
    }

    @Override // uc.n
    public final Object b() {
        Object obj = this.f27991b;
        if (((Type) obj) instanceof ParameterizedType) {
            Type type = ((ParameterizedType) ((Type) obj)).getActualTypeArguments()[0];
            if (type instanceof Class) {
                return EnumSet.noneOf((Class) type);
            }
            throw new com.google.gson.q("Invalid EnumSet type: " + ((Type) this.f27991b).toString());
        }
        throw new com.google.gson.q("Invalid EnumSet type: " + ((Type) this.f27991b).toString());
    }

    public final void c() {
        long j3;
        y8.h hVar = (y8.h) this.f27991b;
        synchronized (n9.a0.f22513b) {
            if (n9.a0.f22514c) {
                j3 = n9.a0.f22515d;
            } else {
                j3 = C.TIME_UNSET;
            }
        }
        int i10 = y8.h.Q;
        hVar.M = j3;
        hVar.u(true);
    }

    public final void d(m2.l lVar, Thread thread, Throwable th2) {
        Task continueWithTask;
        jb.m mVar = (jb.m) this.f27991b;
        synchronized (mVar) {
            b6.a.f2288f.d("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName(), null);
            long currentTimeMillis = System.currentTimeMillis();
            kb.a aVar = mVar.f19908e.a;
            jb.k kVar = new jb.k(mVar, currentTimeMillis, th2, thread, lVar);
            synchronized (aVar.f20630c) {
                continueWithTask = aVar.f20631d.continueWithTask(aVar.f20629b, new gb.d(kVar, 3));
                aVar.f20631d = continueWithTask;
            }
            try {
                jb.a0.a(continueWithTask);
            } catch (TimeoutException unused) {
                b6.a.f2288f.e("Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e2) {
                b6.a.f2288f.e("Error handling uncaught exception", e2);
            }
        }
    }

    public final qb.a e(JSONObject jSONObject) {
        qb.c aVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            b6.a.f2288f.e("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            aVar = new com.facebook.internal.m();
        } else {
            aVar = new ni.a();
        }
        return aVar.g((ni.a) this.f27991b, jSONObject);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        fe.d dVar = (fe.d) obj;
        if (dVar != null) {
            c1 c1Var = (c1) ((he.a0) this.f27991b).f19028c;
            ((fe.c) c1Var.f11924c).a(1, "dispatchOnCameraOpened", dVar);
            ((CameraView) c1Var.f11925d).f16484l.post(new androidx.appcompat.widget.j(25, c1Var, dVar));
            return Tasks.forResult(null);
        }
        throw new RuntimeException("Null options!");
    }

    public q(TypedArray typedArray) {
        this.f27991b = null;
        String string = typedArray.getString(3);
        if (string != null) {
            try {
                a4.j.t(Class.forName(string).newInstance());
                this.f27991b = null;
            } catch (Exception unused) {
            }
        }
    }

    @Override // od.b
    public final void a(View view, JSONObject jSONObject, od.a aVar, boolean z10, boolean z11) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i10 = 0;
            if (z10) {
                HashMap hashMap = new HashMap();
                while (i10 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i10);
                    ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                    i10++;
                }
                ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                    while (it2.hasNext()) {
                        ((rd.a) aVar).a((View) it2.next(), this, jSONObject, z11);
                    }
                }
                return;
            }
            while (i10 < viewGroup.getChildCount()) {
                ((rd.a) aVar).a(viewGroup.getChildAt(i10), this, jSONObject, z11);
                i10++;
            }
        }
    }

    public q(TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        bi.l delegate = new bi.l(ai.f.f500i, timeUnit);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f27991b = delegate;
    }

    public q(Context context) {
        boolean isEmpty;
        this.f27991b = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(d0.h.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = ((SharedPreferences) this.f27991b).getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    ((SharedPreferences) this.f27991b).edit().clear().commit();
                }
            }
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e2.getMessage());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(int i10) {
        this(TimeUnit.MINUTES);
        if (i10 == 9) {
            this.f27991b = new int[2];
        } else if (i10 != 13) {
            this.f27991b = new CopyOnWriteArrayList();
        }
    }
}
