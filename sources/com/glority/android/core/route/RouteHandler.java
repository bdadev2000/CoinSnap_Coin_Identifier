package com.glority.android.core.route;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RouteHandler.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u000b\u001a\u0004\u0018\u00018\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/glority/android/core/route/RouteHandler;", ExifInterface.GPS_DIRECTION_TRUE, "", "dependency", "Lio/reactivex/Observable;", "getDependency", "()Lio/reactivex/Observable;", "url", "", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "(Lcom/glority/android/core/route/RouteRequest;)Ljava/lang/Object;", "post", "", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public interface RouteHandler<T> {
    T execute(RouteRequest<T> request);

    Observable<?> getDependency();

    String getUrl();

    void post(RouteRequest<T> request);

    /* compiled from: RouteHandler.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static <T> Observable<?> getDependency(RouteHandler<T> routeHandler) {
            Intrinsics.checkNotNullParameter(routeHandler, "this");
            return null;
        }

        public static <T> T execute(RouteHandler<T> routeHandler, RouteRequest<T> request) {
            Intrinsics.checkNotNullParameter(routeHandler, "this");
            Intrinsics.checkNotNullParameter(request, "request");
            throw new RuntimeException("Not implemented.");
        }

        public static <T> void post(RouteHandler<T> routeHandler, RouteRequest<T> request) {
            Intrinsics.checkNotNullParameter(routeHandler, "this");
            Intrinsics.checkNotNullParameter(request, "request");
            throw new RuntimeException("Not implemented.");
        }
    }
}
