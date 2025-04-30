package u4;

import android.util.Log;
import java.io.File;
import java.util.NavigableSet;
import java.util.concurrent.Callable;
import z4.C2972a;

/* renamed from: u4.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC2771p implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23150a;
    public final /* synthetic */ C2772q b;

    public /* synthetic */ CallableC2771p(C2772q c2772q, int i9) {
        this.f23150a = i9;
        this.b = c2772q;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f23150a) {
            case 0:
                try {
                    k8.c cVar = this.b.f23154e;
                    z4.c cVar2 = (z4.c) cVar.f21500c;
                    cVar2.getClass();
                    boolean delete = new File((File) cVar2.f24546c, (String) cVar.b).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e4) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e4);
                    return Boolean.FALSE;
                }
            default:
                C2769n c2769n = this.b.f23156g;
                k8.c cVar3 = c2769n.f23136c;
                z4.c cVar4 = (z4.c) cVar3.f21500c;
                cVar4.getClass();
                File file = (File) cVar4.f24546c;
                String str = (String) cVar3.b;
                String str2 = null;
                boolean z8 = true;
                if (!new File(file, str).exists()) {
                    NavigableSet c9 = ((C2972a) c2769n.m.b).c();
                    if (!c9.isEmpty()) {
                        str2 = (String) c9.first();
                    }
                    if (str2 == null || !c2769n.f23143j.c(str2)) {
                        z8 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    z4.c cVar5 = (z4.c) cVar3.f21500c;
                    cVar5.getClass();
                    new File((File) cVar5.f24546c, str).delete();
                }
                return Boolean.valueOf(z8);
        }
    }
}
