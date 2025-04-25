package com.glority.base.recognize;

import androidx.lifecycle.LifecycleOwner;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import com.glority.component.generatedAPI.kotlinAPI.recognize.Location;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;

/* compiled from: IRecognize.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JK\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0017"}, d2 = {"Lcom/glority/base/recognize/IRecognize;", "", "startRecognize", "", "itemImage", "", "Ljava/io/File;", "photoFrom", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;", "wifi", "", "shootLocation", "Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;", "uploadLocation", "shootDate", "Ljava/util/Date;", "(Ljava/util/List;Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;Ljava/lang/Boolean;Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;Lcom/glority/component/generatedAPI/kotlinAPI/recognize/Location;Ljava/util/Date;)V", "addListener", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/base/recognize/RecognizeListener;", "removeListener", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public interface IRecognize {
    void addListener(LifecycleOwner lifecycleOwner, RecognizeListener listener);

    void removeListener(LifecycleOwner lifecycleOwner);

    void startRecognize(List<? extends File> itemImage, PhotoFrom photoFrom, Boolean wifi, Location shootLocation, Location uploadLocation, Date shootDate);
}
