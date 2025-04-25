package com.glority.base.recognize;

import java.util.List;
import kotlin.Metadata;

/* compiled from: IRecognize.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/glority/base/recognize/RecognizeListener;", "", "onSuccess", "", "itemIds", "", "", "data", "extraInfo", "", "onFail", "throwable", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public interface RecognizeListener {
    void onFail(Throwable throwable);

    void onSuccess(List<Long> itemIds, Object data, String extraInfo);

    /* compiled from: IRecognize.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void onSuccess$default(RecognizeListener recognizeListener, List list, Object obj, String str, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccess");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            recognizeListener.onSuccess(list, obj, str);
        }
    }
}
