package G2;

import G7.j;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.internal.AbstractC1844m;
import com.facebook.r;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1273a = new Object();
    public static Boolean b;

    public final Intent a(Context context) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage(FbValidationUtils.FB_PACKAGE);
                if (packageManager.resolveService(intent, 0) != null && AbstractC1844m.a(context, FbValidationUtils.FB_PACKAGE)) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (AbstractC1844m.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final f b(d dVar, String str, List list) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            f fVar = f.f1270c;
            Context a6 = r.a();
            Intent a9 = a(a6);
            if (a9 != null) {
                e eVar = new e();
                boolean bindService = a6.bindService(a9, eVar, 1);
                f fVar2 = f.f1271d;
                try {
                    if (bindService) {
                        try {
                            eVar.b.await(5L, TimeUnit.SECONDS);
                            IBinder iBinder = eVar.f1269c;
                            if (iBinder != null) {
                                S2.c b8 = S2.b.b(iBinder);
                                Bundle a10 = c.a(dVar, str, list);
                                if (a10 != null) {
                                    S2.a aVar = (S2.a) b8;
                                    aVar.getClass();
                                    Parcel obtain = Parcel.obtain();
                                    Parcel obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                                        obtain.writeInt(1);
                                        a10.writeToParcel(obtain, 0);
                                        aVar.b.transact(1, obtain, obtain2, 0);
                                        obtain2.readException();
                                        obtain2.readInt();
                                        obtain2.recycle();
                                        obtain.recycle();
                                        j.j(a10, "Successfully sent events to the remote service: ");
                                    } catch (Throwable th) {
                                        obtain2.recycle();
                                        obtain.recycle();
                                        throw th;
                                    }
                                }
                                fVar = f.b;
                            }
                            a6.unbindService(eVar);
                            return fVar;
                        } catch (RemoteException unused) {
                            r rVar = r.f13801a;
                            a6.unbindService(eVar);
                            return fVar2;
                        } catch (InterruptedException unused2) {
                            r rVar2 = r.f13801a;
                            a6.unbindService(eVar);
                            return fVar2;
                        }
                    }
                    return fVar2;
                } catch (Throwable th2) {
                    a6.unbindService(eVar);
                    r rVar3 = r.f13801a;
                    throw th2;
                }
            }
            return fVar;
        } catch (Throwable th3) {
            O2.a.a(this, th3);
            return null;
        }
    }
}
