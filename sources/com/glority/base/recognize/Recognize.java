package com.glority.base.recognize;

import androidx.lifecycle.LifecycleOwner;
import com.glority.base.routers.business.GetRecognizeImpRequest;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import com.glority.component.generatedAPI.kotlinAPI.recognize.Location;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Recognize.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/glority/base/recognize/Recognize;", "", "<init>", "()V", "recognizeImp", "Lcom/glority/base/recognize/IRecognize;", "getRecognizeImp", "()Lcom/glority/base/recognize/IRecognize;", "startRecognize", "", "itemImage", "", "Ljava/io/File;", "photoFrom", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;", "wifi", "", "shootLocation", "Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;", "uploadLocation", "shootDate", "Ljava/util/Date;", "(Ljava/util/List;Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;Ljava/lang/Boolean;Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;Ljava/util/Date;)V", "addListener", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/base/recognize/RecognizeListener;", "removeListener", "destroy", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class Recognize {
    private static IRecognize recognizeImp;
    public static final Recognize INSTANCE = new Recognize();
    public static final int $stable = 8;

    private Recognize() {
    }

    private final IRecognize getRecognizeImp() {
        if (recognizeImp == null) {
            recognizeImp = new GetRecognizeImpRequest().toResult();
        }
        return recognizeImp;
    }

    public final void startRecognize(List<? extends File> itemImage, PhotoFrom photoFrom, Boolean wifi, Location shootLocation, Location uploadLocation, Date shootDate) {
        Intrinsics.checkNotNullParameter(itemImage, "itemImage");
        Intrinsics.checkNotNullParameter(photoFrom, "photoFrom");
        IRecognize recognizeImp2 = getRecognizeImp();
        if (recognizeImp2 != null) {
            recognizeImp2.startRecognize(itemImage, photoFrom, wifi, shootLocation, uploadLocation, shootDate);
        }
    }

    public final void addListener(LifecycleOwner lifecycleOwner, RecognizeListener listener) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IRecognize recognizeImp2 = getRecognizeImp();
        if (recognizeImp2 != null) {
            recognizeImp2.addListener(lifecycleOwner, listener);
        }
    }

    public final void removeListener(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        IRecognize recognizeImp2 = getRecognizeImp();
        if (recognizeImp2 != null) {
            recognizeImp2.removeListener(lifecycleOwner);
        }
    }

    public final void destroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        IRecognize recognizeImp2 = getRecognizeImp();
        if (recognizeImp2 != null) {
            recognizeImp2.removeListener(lifecycleOwner);
        }
        recognizeImp = null;
    }
}
