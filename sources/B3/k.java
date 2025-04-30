package B3;

import android.database.Cursor;
import java.util.HashSet;
import java.util.logging.Level;
import w4.v0;

/* loaded from: classes2.dex */
public final class k implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f293c;

    public /* synthetic */ k(Object obj, int i9) {
        this.b = i9;
        this.f293c = obj;
    }

    private final void b() {
        l8.a c9;
        long j7;
        while (true) {
            l8.c cVar = (l8.c) this.f293c;
            synchronized (cVar) {
                c9 = cVar.c();
            }
            if (c9 == null) {
                return;
            }
            l8.b bVar = c9.f21640c;
            G7.j.b(bVar);
            l8.c cVar2 = (l8.c) this.f293c;
            boolean isLoggable = l8.c.f21648i.isLoggable(Level.FINE);
            if (isLoggable) {
                bVar.f21642a.f21649a.getClass();
                j7 = System.nanoTime();
                v0.c(c9, bVar, "starting");
            } else {
                j7 = -1;
            }
            try {
                l8.c.a(cVar2, c9);
                if (isLoggable) {
                    bVar.f21642a.f21649a.getClass();
                    v0.c(c9, bVar, G7.j.j(v0.l(System.nanoTime() - j7), "finished run in "));
                }
            } finally {
            }
        }
    }

    public HashSet a() {
        HashSet hashSet = new HashSet();
        Cursor g9 = ((D0.e) this.f293c).f596c.g(new H0.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 0));
        while (g9.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(g9.getInt(0)));
            } catch (Throwable th) {
                g9.close();
                throw th;
            }
        }
        g9.close();
        if (!hashSet.isEmpty()) {
            ((D0.e) this.f293c).f599f.p();
        }
        return hashSet;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Removed duplicated region for block: B:180:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.k.run():void");
    }
}
