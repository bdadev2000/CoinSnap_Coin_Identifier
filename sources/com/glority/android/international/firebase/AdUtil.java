package com.glority.android.international.firebase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;

/* compiled from: AdUtil.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/glority/android/international/firebase/AdUtil;", "", "()V", "adId", "", "getAdId", "()Ljava/lang/String;", "setAdId", "(Ljava/lang/String;)V", "advertisingIdInternal", "", "getAdvertisingIdInternal", "()Lkotlin/Unit;", "doing", "", "listeners", "", "Lcom/glority/android/international/firebase/AdUtil$OnAdIdReceiveListener;", "getAdvertisingId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "init", "OnAdIdReceiveListener", "base-firebase_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class AdUtil {
    public static final AdUtil INSTANCE = new AdUtil();
    private static String adId;
    private static boolean doing;
    private static List<OnAdIdReceiveListener> listeners;

    /* compiled from: AdUtil.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/glority/android/international/firebase/AdUtil$OnAdIdReceiveListener;", "", "onAdIdReceived", "", "adId", "", "base-firebase_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes3.dex */
    public interface OnAdIdReceiveListener {
        void onAdIdReceived(String adId);
    }

    private AdUtil() {
    }

    public final String getAdId() {
        return adId;
    }

    public final void setAdId(String str) {
        adId = str;
    }

    public final void init() {
        getAdvertisingIdInternal();
    }

    public final void getAdvertisingId(OnAdIdReceiveListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        String str = adId;
        if (str != null) {
            listener.onAdIdReceived(str);
            return;
        }
        if (listeners == null) {
            listeners = new ArrayList();
        }
        List<OnAdIdReceiveListener> list = listeners;
        Intrinsics.checkNotNull(list);
        list.add(listener);
        getAdvertisingIdInternal();
    }

    private final Unit getAdvertisingIdInternal() {
        if (doing) {
            return Unit.INSTANCE;
        }
        doing = true;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AdUtil$advertisingIdInternal$1(null), 3, null);
        return Unit.INSTANCE;
    }
}
