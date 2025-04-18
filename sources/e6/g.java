package e6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.internal.l0;
import com.facebook.n0;
import com.facebook.p0;
import com.facebook.q;
import com.facebook.x;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ni.l;
import org.json.JSONObject;
import w3.e0;
import w3.o;
import wh.y0;

/* loaded from: classes3.dex */
public final class g implements l0, l, e0 {

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f17131c;

    /* renamed from: b, reason: collision with root package name */
    public static final g f17130b = new g();

    /* renamed from: d, reason: collision with root package name */
    public static final g f17132d = new g();

    /* renamed from: f, reason: collision with root package name */
    public static final g f17133f = new g();

    /* renamed from: g, reason: collision with root package name */
    public static final g f17134g = new g();

    @Override // com.facebook.internal.l0
    public void a(JSONObject jSONObject) {
        String optString;
        Uri uri;
        Uri uri2 = null;
        if (jSONObject == null) {
            optString = null;
        } else {
            optString = jSONObject.optString("id");
        }
        if (optString == null) {
            Log.w(n0.f11346j, "No user ID returned on Me request");
            return;
        }
        String optString2 = jSONObject.optString("link");
        String optString3 = jSONObject.optString("profile_picture", null);
        String optString4 = jSONObject.optString("first_name");
        String optString5 = jSONObject.optString("middle_name");
        String optString6 = jSONObject.optString("last_name");
        String optString7 = jSONObject.optString("name");
        if (optString2 != null) {
            uri = Uri.parse(optString2);
        } else {
            uri = null;
        }
        if (optString3 != null) {
            uri2 = Uri.parse(optString3);
        }
        p0.f11356d.s().a(new n0(optString, optString4, optString5, optString6, optString7, uri, uri2), true);
    }

    @Override // com.facebook.internal.l0
    public void b(q qVar) {
        Log.e(n0.f11346j, Intrinsics.stringPlus("Got unexpected exception: ", qVar));
    }

    public Intent c(Context context) {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage(FbValidationUtils.FB_PACKAGE);
                if (packageManager.resolveService(intent, 0) != null && com.facebook.internal.q.a(context, FbValidationUtils.FB_PACKAGE)) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (com.facebook.internal.q.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    @Override // ni.l
    public Object convert(Object obj) {
        ((y0) obj).close();
        return Unit.INSTANCE;
    }

    public f d(d dVar, String str, List list) {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            f fVar = f.SERVICE_NOT_AVAILABLE;
            Context a = x.a();
            Intent c10 = c(a);
            if (c10 != null) {
                e eVar = new e();
                boolean bindService = a.bindService(c10, eVar, 1);
                f fVar2 = f.SERVICE_ERROR;
                try {
                    if (bindService) {
                        try {
                            try {
                                eVar.f17124b.await(5L, TimeUnit.SECONDS);
                                IBinder iBinder = eVar.f17125c;
                                if (iBinder != null) {
                                    q6.c d10 = q6.b.d(iBinder);
                                    Bundle b3 = c.b(dVar, str, list);
                                    if (b3 != null) {
                                        q6.a aVar = (q6.a) d10;
                                        Parcel obtain = Parcel.obtain();
                                        Parcel obtain2 = Parcel.obtain();
                                        try {
                                            obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                                            obtain.writeInt(1);
                                            b3.writeToParcel(obtain, 0);
                                            aVar.f23690b.transact(1, obtain, obtain2, 0);
                                            obtain2.readException();
                                            obtain2.readInt();
                                            obtain2.recycle();
                                            obtain.recycle();
                                            Intrinsics.stringPlus("Successfully sent events to the remote service: ", b3);
                                        } catch (Throwable th2) {
                                            obtain2.recycle();
                                            obtain.recycle();
                                            throw th2;
                                        }
                                    }
                                    fVar = f.OPERATION_SUCCESS;
                                }
                                a.unbindService(eVar);
                                return fVar;
                            } catch (InterruptedException unused) {
                                x xVar = x.a;
                                a.unbindService(eVar);
                                return fVar2;
                            }
                        } catch (RemoteException unused2) {
                            x xVar2 = x.a;
                            a.unbindService(eVar);
                            return fVar2;
                        }
                    }
                    return fVar2;
                } catch (Throwable th3) {
                    a.unbindService(eVar);
                    x xVar3 = x.a;
                    throw th3;
                }
            }
            return fVar;
        } catch (Throwable th4) {
            m6.a.a(this, th4);
            return null;
        }
    }

    @Override // w3.e0
    public Object f(x3.b bVar, float f10) {
        int u = bVar.u();
        if (u == 1) {
            return o.b(bVar, f10);
        }
        if (u == 3) {
            return o.b(bVar, f10);
        }
        if (u == 7) {
            PointF pointF = new PointF(((float) bVar.r()) * f10, ((float) bVar.r()) * f10);
            while (bVar.p()) {
                bVar.T();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(vd.e.j(u)));
    }
}
