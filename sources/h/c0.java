package h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.facebook.CustomTabActivity;
import com.facebook.CustomTabMainActivity;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.jvm.internal.Intrinsics;
import s7.s2;

/* loaded from: classes.dex */
public final class c0 extends BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18526c = 0;
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18527b;

    public /* synthetic */ c0(Object obj, int i10) {
        this.a = i10;
        this.f18527b = obj;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((ic.v) this.f18527b).f19582d.f12075b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        nd.i iVar;
        boolean z10;
        int i10 = 3;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                ((d0) this.f18527b).e();
                return;
            case 1:
                if (intent != null) {
                    ((s2.c) this.f18527b).f(intent);
                    return;
                }
                return;
            case 2:
                if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    androidx.work.p.e().b(s2.f.f24164i, "Network broadcast received", new Throwable[0]);
                    s2.f fVar = (s2.f) this.f18527b;
                    fVar.b(fVar.e());
                    return;
                }
                return;
            case 3:
                a4.j.t(this.f18527b);
                throw null;
            case 4:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                ((CustomTabActivity) this.f18527b).finish();
                return;
            case 5:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intent intent2 = new Intent((CustomTabMainActivity) this.f18527b, (Class<?>) CustomTabMainActivity.class);
                intent2.setAction(CustomTabMainActivity.f10875j);
                String str = CustomTabMainActivity.f10873h;
                intent2.putExtra(str, intent.getStringExtra(str));
                intent2.addFlags(603979776);
                ((CustomTabMainActivity) this.f18527b).startActivity(intent2);
                return;
            case 6:
                s2 s2Var = (s2) this.f18527b;
                s2Var.a.post(new androidx.activity.d(s2Var, 27));
                return;
            case 7:
                if (!isInitialStickyBroadcast()) {
                    u7.l.a((u7.l) this.f18527b, u7.h.b(context, intent));
                    return;
                }
                return;
            case 8:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            if (type != 9) {
                                                i10 = 8;
                                            } else {
                                                i10 = 7;
                                            }
                                        }
                                        i10 = 5;
                                    }
                                }
                                i10 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i10 = 4;
                                    break;
                                case 13:
                                    i10 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i10 = 6;
                                    break;
                                case 18:
                                    i10 = 2;
                                    break;
                                case 20:
                                    if (n9.h0.a >= 29) {
                                        i10 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i10 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (n9.h0.a < 31 && i10 == 5) {
                        n9.w wVar = (n9.w) this.f18527b;
                        try {
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            telephonyManager.getClass();
                            n9.v vVar = new n9.v(wVar);
                            com.google.android.gms.internal.ads.b.r(telephonyManager, com.bytedance.sdk.component.adexpress.vc.a.r(context), vVar);
                            com.google.android.gms.internal.ads.b.s(telephonyManager, vVar);
                            return;
                        } catch (RuntimeException unused2) {
                            n9.w.a(5, wVar);
                            return;
                        }
                    }
                    n9.w.a(i10, (n9.w) this.f18527b);
                    return;
                }
                i10 = 0;
                if (n9.h0.a < 31) {
                }
                n9.w.a(i10, (n9.w) this.f18527b);
                return;
            case 9:
                ic.v vVar2 = (ic.v) this.f18527b;
                if (vVar2 != null && vVar2.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    ic.v vVar3 = (ic.v) this.f18527b;
                    vVar3.f19582d.getClass();
                    FirebaseMessaging.b(0L, vVar3);
                    ((ic.v) this.f18527b).f19582d.f12075b.unregisterReceiver(this);
                    this.f18527b = null;
                    return;
                }
                return;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    iVar = (nd.i) this.f18527b;
                    z10 = iVar.f22746c;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    iVar = (nd.i) this.f18527b;
                    z10 = iVar.f22746c;
                    z11 = false;
                } else {
                    return;
                }
                iVar.a(z11, z10);
                ((nd.i) this.f18527b).f22745b = z11;
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(u7.l lVar) {
        this(lVar, 7);
        this.a = 7;
    }

    public c0(ic.v vVar) {
        this.a = 9;
        this.f18527b = vVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(n9.w wVar) {
        this(wVar, 8);
        this.a = 8;
    }
}
