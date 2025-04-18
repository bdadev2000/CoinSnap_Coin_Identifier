package gb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.v;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.plantcare.ai.identifier.plantid.app.GlobalApp;
import com.plantcare.ai.identifier.plantid.ui.component.diagnose.DiagnoseActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera.PlantIdentifierActivity;
import com.vungle.ads.internal.i0;
import com.vungle.ads.k0;
import com.vungle.ads.t1;
import f2.i;
import f7.e;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import jb.a0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import lc.j;
import n9.l;
import net.premiumads.sdk.admob.PremiumNativeAd;
import net.premiumads.sdk.admob.PremiumRewardedAd;
import o0.u;
import qc.j0;
import qc.k;
import s2.h;
import s7.f2;
import s7.j1;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements cc.a, Continuation, SuccessContinuation, e, androidx.activity.result.b, OnUserEarnedRewardListener, i0, OnSuccessListener, NativeAd.OnNativeAdLoadedListener, l, u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18380c;

    public /* synthetic */ d(Object obj, int i10) {
        this.f18379b = i10;
        this.f18380c = obj;
    }

    @Override // androidx.activity.result.b
    public void a(Object obj) {
        int i10 = this.f18379b;
        Object obj2 = this.f18380c;
        switch (i10) {
            case 8:
                DiagnoseActivity activity = (DiagnoseActivity) obj2;
                int i11 = DiagnoseActivity.f16607n;
                Intrinsics.checkNotNullParameter(activity, "this$0");
                if (((androidx.activity.result.a) obj).f595b == -1 && !activity.o().getBoolean("key_set_show_dialod_rate", false) && !GlobalApp.f16593g) {
                    GlobalApp.f16593g = true;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    return;
                }
                return;
            default:
                gg.e this$0 = (gg.e) obj2;
                int i12 = gg.e.f18467j;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((androidx.activity.result.a) obj).f595b == -1) {
                    Context context = this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
                    if (!defaultSharedPreferences.getBoolean("key_set_show_dialod_rate", false) && !GlobalApp.f16593g) {
                        GlobalApp.f16593g = true;
                        FragmentActivity activity2 = this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(activity2, "requireActivity(...)");
                        Intrinsics.checkNotNullParameter(activity2, "activity");
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // f7.e
    public Object apply(Object obj) {
        ((k) this.f18380c).getClass();
        String c10 = j0.f23825b.c((qc.i0) obj);
        Intrinsics.checkNotNullExpressionValue(c10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + c10);
        byte[] bytes = c10.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // cc.a
    public void h(cc.c cVar) {
        c cVar2 = (c) this.f18380c;
        h hVar = ((j) ((oc.a) cVar.get())).a().f21336k;
        ((Set) hVar.f24172f).add(cVar2);
        Task b3 = ((mc.d) hVar.f24169b).b();
        b3.addOnSuccessListener((Executor) hVar.f24171d, new i(10, hVar, b3, cVar2));
        b6.a.f2288f.d("Registering RemoteConfig Rollouts subscriber", null);
    }

    @Override // n9.l
    public void invoke(Object obj) {
        ((f2) obj).r((j1) this.f18380c, this.f18379b);
    }

    @Override // com.vungle.ads.internal.i0
    public void onImpression(View view) {
        int i10 = this.f18379b;
        Object obj = this.f18380c;
        switch (i10) {
            case 11:
                k0.a((k0) obj, view);
                return;
            default:
                t1.c((t1) obj, view);
                return;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(NativeAd nativeAd) {
        ((PremiumNativeAd) this.f18380c).onNativeAdFetched(nativeAd);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        com.vungle.ads.internal.platform.b.b((com.vungle.ads.internal.platform.b) this.f18380c, (AppSetIdInfo) obj);
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        int i10 = this.f18379b;
        Object obj = this.f18380c;
        switch (i10) {
            case 10:
                PlantIdentifierActivity this$0 = (PlantIdentifierActivity) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(rewardItem, "rewardItem");
                rewardItem.getAmount();
                Intrinsics.checkNotNullExpressionValue(rewardItem.getType(), "getType(...)");
                this$0.f16677m = null;
                x5.i.f27402f = true;
                return;
            default:
                MediationRewardedAdCallback mediationRewardedAdCallback = ((PremiumRewardedAd) obj).f22762d;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback.onUserEarnedReward(rewardItem);
                    return;
                }
                return;
        }
    }

    @Override // o0.u
    public boolean p(View view) {
        ((SideSheetBehavior) this.f18380c).x(this.f18379b);
        return true;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z10;
        int i10 = this.f18379b;
        Object obj = this.f18380c;
        switch (i10) {
            case 1:
                ((ob.c) obj).getClass();
                boolean isSuccessful = task.isSuccessful();
                b6.a aVar = b6.a.f2288f;
                if (isSuccessful) {
                    jb.a aVar2 = (jb.a) task.getResult();
                    aVar.d("Crashlytics report successfully enqueued to DataTransport: " + aVar2.f19873b, null);
                    File file = aVar2.f19874c;
                    if (file.delete()) {
                        aVar.d("Deleted report file: " + file.getPath(), null);
                    } else {
                        aVar.i("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                    z10 = true;
                } else {
                    aVar.i("Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 2:
                ExecutorService executorService = a0.a;
                ((CountDownLatch) obj).countDown();
                return null;
            case 3:
                return (Task) ((Callable) obj).call();
            case 4:
                ((Runnable) obj).run();
                return Tasks.forResult(null);
            default:
                ((v) obj).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null || (string = bundle.getString("unregistered")) != null) {
                        return string;
                    }
                    String string2 = bundle.getString("error");
                    if ("RST".equals(string2)) {
                        throw new IOException("INSTANCE_ID_RESET");
                    }
                    if (string2 != null) {
                        throw new IOException(string2);
                    }
                    Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        mc.h hVar = (mc.h) this.f18380c;
        int[] iArr = mc.i.f22181k;
        return Tasks.forResult(hVar);
    }
}
