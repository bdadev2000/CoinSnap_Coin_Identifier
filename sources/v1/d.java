package v1;

import android.os.RemoteException;
import android.util.Log;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;

/* loaded from: classes.dex */
public final class d extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25863c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y yVar, String[] strArr) {
        super(strArr);
        this.f25862b = 1;
        this.f25863c = yVar;
    }

    @Override // v1.r
    public final boolean a() {
        switch (this.f25862b) {
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // v1.r
    public final void b(Set tables) {
        int i10 = this.f25862b;
        Object obj = this.f25863c;
        switch (i10) {
            case 0:
                ((Channel) obj).mo1659trySendJP2dKIU(Unit.INSTANCE);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(tables, "tables");
                if (!((y) obj).f25966i.get()) {
                    try {
                        p pVar = ((y) obj).f25964g;
                        if (pVar != null) {
                            pVar.c(((y) obj).f25962e, (String[]) tables.toArray(new String[0]));
                            return;
                        }
                        return;
                    } catch (RemoteException e2) {
                        Log.w("ROOM", "Cannot broadcast invalidation", e2);
                        return;
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(tables, "tables");
                l.b v10 = l.b.v();
                k0 k0Var = ((l0) obj).f25925j;
                if (v10.w()) {
                    k0Var.run();
                    return;
                } else {
                    v10.x(k0Var);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String[] strArr, Object obj, int i10) {
        super(strArr);
        this.f25862b = i10;
        this.f25863c = obj;
    }
}
