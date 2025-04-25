package com.glority.android.picturexx.extensions;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: MapViewExt.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a<\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0087@¢\u0006\u0002\u0010\u000e\u001a \u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0083@¢\u0006\u0002\u0010\u0012\u001a\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a\"\u0010\u0016\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0087@¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"buildMarkerTag", "Lcom/glority/android/picturexx/extensions/MarkerTag;", "count", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "addCoinMarker", "Lcom/google/android/gms/maps/model/Marker;", "Lcom/google/android/gms/maps/GoogleMap;", "context", "Landroid/content/Context;", "latitude", "", "longitude", "(Lcom/google/android/gms/maps/GoogleMap;Landroid/content/Context;DDILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFlagBitmap", "Landroid/graphics/Bitmap;", "flagUrl", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertViewToBitmap", "view", "Landroid/view/View;", "setSelected", "", "selected", "", "(Lcom/google/android/gms/maps/model/Marker;Landroid/content/Context;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class MapViewExtKt {
    public static final MarkerTag buildMarkerTag(int i, String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new MarkerTag(i, countryCode);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object addCoinMarker(com.google.android.gms.maps.GoogleMap r6, android.content.Context r7, double r8, double r10, int r12, java.lang.String r13, kotlin.coroutines.Continuation<? super com.google.android.gms.maps.model.Marker> r14) {
        /*
            boolean r0 = r14 instanceof com.glority.android.picturexx.extensions.MapViewExtKt$addCoinMarker$1
            if (r0 == 0) goto L14
            r0 = r14
            com.glority.android.picturexx.extensions.MapViewExtKt$addCoinMarker$1 r0 = (com.glority.android.picturexx.extensions.MapViewExtKt$addCoinMarker$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L19
        L14:
            com.glority.android.picturexx.extensions.MapViewExtKt$addCoinMarker$1 r0 = new com.glority.android.picturexx.extensions.MapViewExtKt$addCoinMarker$1
            r0.<init>(r14)
        L19:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            int r12 = r0.I$0
            double r10 = r0.D$1
            double r8 = r0.D$0
            java.lang.Object r6 = r0.L$2
            com.glority.android.picturexx.business.databinding.LayoutSummuryMapMarkerBinding r6 = (com.glority.android.picturexx.business.databinding.LayoutSummuryMapMarkerBinding) r6
            java.lang.Object r7 = r0.L$1
            r13 = r7
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r7 = r0.L$0
            com.google.android.gms.maps.GoogleMap r7 = (com.google.android.gms.maps.GoogleMap) r7
            kotlin.ResultKt.throwOnFailure(r14)
            goto L7d
        L3d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L45:
            kotlin.ResultKt.throwOnFailure(r14)
            com.glority.android.cmsui2.util.CmsDataUtils r14 = com.glority.android.cmsui2.util.CmsDataUtils.INSTANCE
            java.lang.String r14 = r14.getCountryFlagIconUrl(r13)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)
            com.glority.android.picturexx.business.databinding.LayoutSummuryMapMarkerBinding r2 = com.glority.android.picturexx.business.databinding.LayoutSummuryMapMarkerBinding.inflate(r2)
            java.lang.String r4 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            androidx.appcompat.widget.AppCompatTextView r4 = r2.tvCount
            java.lang.String r5 = java.lang.String.valueOf(r12)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
            r0.L$0 = r6
            r0.L$1 = r13
            r0.L$2 = r2
            r0.D$0 = r8
            r0.D$1 = r10
            r0.I$0 = r12
            r0.label = r3
            java.lang.Object r14 = getFlagBitmap(r7, r14, r0)
            if (r14 != r1) goto L7b
            return r1
        L7b:
            r7 = r6
            r6 = r2
        L7d:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            androidx.appcompat.widget.AppCompatImageView r0 = r6.ivMarker
            r0.setImageBitmap(r14)
            android.view.View r6 = r6.getRoot()
            java.lang.String r14 = "getRoot(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r14)
            android.graphics.Bitmap r6 = convertViewToBitmap(r6)
            com.google.android.gms.maps.model.MarkerOptions r14 = new com.google.android.gms.maps.model.MarkerOptions
            r14.<init>()
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            r0.<init>(r8, r10)
            com.google.android.gms.maps.model.MarkerOptions r8 = r14.position(r0)
            com.google.android.gms.maps.model.BitmapDescriptor r6 = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(r6)
            com.google.android.gms.maps.model.MarkerOptions r6 = r8.icon(r6)
            com.google.android.gms.maps.model.Marker r6 = r7.addMarker(r6)
            if (r6 == 0) goto Lb4
            com.glority.android.picturexx.extensions.MarkerTag r7 = buildMarkerTag(r12, r13)
            r6.setTag(r7)
        Lb4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.extensions.MapViewExtKt.addCoinMarker(com.google.android.gms.maps.GoogleMap, android.content.Context, double, double, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getFlagBitmap(Context context, String str, Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new MapViewExtKt$getFlagBitmap$2(context, str, null), continuation);
    }

    private static final Bitmap convertViewToBitmap(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        view.layout(0, 0, measuredWidth, measuredHeight);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object setSelected(com.google.android.gms.maps.model.Marker r6, android.content.Context r7, boolean r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.extensions.MapViewExtKt.setSelected(com.google.android.gms.maps.model.Marker, android.content.Context, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
