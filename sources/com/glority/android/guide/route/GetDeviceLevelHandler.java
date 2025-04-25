package com.glority.android.guide.route;

import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.guide.utils.BasePurchaseUrlRouter;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetDeviceLevelHandler.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0003J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/glority/android/guide/route/GetDeviceLevelHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "(Lcom/glority/android/core/route/RouteRequest;)Ljava/lang/Integer;", "Companion", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GetDeviceLevelHandler implements RouteHandler<Integer> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<String> highLevelDevices;
    private static final List<String> lowLevelDevices;

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Integer> routeRequest) {
        RouteHandler.DefaultImpls.post(this, routeRequest);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return BasePurchaseUrlRouter.INSTANCE.getURL_GET_DEVICE_LEVEL();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Integer execute(RouteRequest<Integer> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof GetDeviceLevelRequest) {
            List<String> list = highLevelDevices;
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            String lowerCase = MODEL.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (list.contains(lowerCase)) {
                return 2;
            }
            List<String> list2 = lowLevelDevices;
            String MODEL2 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
            String lowerCase2 = MODEL2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            if (list2.contains(lowerCase2)) {
                return 0;
            }
        }
        return 1;
    }

    /* compiled from: GetDeviceLevelHandler.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/glority/android/guide/route/GetDeviceLevelHandler$Companion;", "", "()V", "highLevelDevices", "", "", "getHighLevelDevices", "()Ljava/util/List;", "lowLevelDevices", "getLowLevelDevices", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<String> getHighLevelDevices() {
            return GetDeviceLevelHandler.highLevelDevices;
        }

        public final List<String> getLowLevelDevices() {
            return GetDeviceLevelHandler.lowLevelDevices;
        }
    }

    static {
        List<String> mutableListOf = CollectionsKt.mutableListOf("SM-G991B", "SM-G973F", "SM-G975F", "SM-G998B", "VOG-L29", "SM-G780F", "SM-N975F", "SM-G985F", "SM-G980F", "SM-G996B", "SM-G965F", "SM-N986B", "ELE-L29", "SM-G781B", "SM-G991U", "SM-G998U", "SM-G988B", "SM-G9730", "SM-G981U1");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableListOf, 10));
        for (String str : mutableListOf) {
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = str.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            arrayList.add(lowerCase);
        }
        highLevelDevices = arrayList;
        List<String> mutableListOf2 = CollectionsKt.mutableListOf("M2003J15SC", "RedmiNote8", "RedmiNote9Pro", "SM-A325M", "SM-A217M", "M2102J20SG", "M2004J19C", "RedmiNote9S", "SM-A107M", "motog(9)play", "motog(20)", "SM-A125M", "SM-A115M", "SM-A105M", "SM-A207M", "SM-A205G", "SM-A225M", "SM-G610M", "M2007J17C");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableListOf2, 10));
        for (String str2 : mutableListOf2) {
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = str2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            arrayList2.add(lowerCase2);
        }
        lowLevelDevices = arrayList2;
    }
}
