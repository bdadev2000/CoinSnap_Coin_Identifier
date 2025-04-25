package com.glority.base.utils;

import androidx.fragment.app.Fragment;
import com.glority.base.utils.ImagePicker;
import com.glority.imagepicker.MultiImageSelector;
import com.glority.imagepicker.bean.ResultImage;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: ImagePicker.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ImagePicker$customImagePicker$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ImagePicker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePicker$customImagePicker$1(ImagePicker imagePicker) {
        super(0);
        this.this$0 = imagePicker;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2() {
        int i;
        int i2;
        Fragment fragment;
        MultiImageSelector showCamera = MultiImageSelector.create().showCamera(false);
        i = this.this$0.pickCount;
        MultiImageSelector listener = showCamera.count(i).listener(new ImagePicker$customImagePicker$1$$ExternalSyntheticLambda0(this.this$0));
        i2 = this.this$0.pickCount;
        if (i2 > 1) {
            listener.multi();
        } else {
            listener.single();
        }
        fragment = this.this$0.context;
        listener.start(fragment, 0);
    }

    public static final void invoke$lambda$1(ImagePicker this$0, int i, ArrayList arrayList) {
        ImagePicker.OnImageSelectedListener onImageSelectedListener;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        onImageSelectedListener = this$0.onImageSelectedListener;
        if (onImageSelectedListener != null) {
            if (arrayList == null) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList3 = arrayList;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((ResultImage) it.next()).imageUri);
                }
                arrayList2 = arrayList4;
            }
            onImageSelectedListener.onImageSelected(arrayList2);
        }
    }
}
