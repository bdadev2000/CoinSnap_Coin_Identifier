package com.glority.android.picturexx.view.recognize;

import android.view.View;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.imagepicker.ImagePicker;
import com.glority.imagepicker.MultiImageSelector;
import com.glority.imagepicker.MultiImageSelectorActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: SuggestToAddActivity.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u001d\u0010\u0002\u001a\u0019\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00022\u0015\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\b\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\bH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "adapter", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lkotlin/ParameterName;", "name", "view", "Landroid/view/View;", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SuggestToAddActivity$initView$3 extends Lambda implements Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit> {
    final /* synthetic */ SuggestToAddActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestToAddActivity$initView$3(SuggestToAddActivity suggestToAddActivity) {
        super(3);
        this.this$0 = suggestToAddActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
        invoke(baseQuickAdapter, view, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BaseQuickAdapter<?, ?> adapter, View view, int i) {
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getId() == R.id.suggest_delete_picture) {
            ArrayList arrayList3 = new ArrayList();
            arrayList2 = this.this$0.imageSelectedList;
            arrayList3.addAll(arrayList2);
            arrayList3.remove(i);
            this.this$0.updateImageList(arrayList3);
            return;
        }
        if (view.getId() == R.id.suggest_add_image) {
            ImagePicker imagePicker = ImagePicker.INSTANCE;
            SuggestToAddActivity suggestToAddActivity = this.this$0;
            SuggestToAddActivity suggestToAddActivity2 = suggestToAddActivity;
            i2 = suggestToAddActivity.MAX_IMAGE_SIZE;
            arrayList = this.this$0.imageSelectedList;
            imagePicker.pickPhoto(suggestToAddActivity2, true, i2, new ArrayList<>(arrayList), new SuggestToAddActivity$initView$3$$ExternalSyntheticLambda0(this.this$0));
        }
    }

    public static final void invoke$lambda$0(SuggestToAddActivity this$0, int i, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MultiImageSelectorActivity.setSelectorListener(null);
        MultiImageSelector.create().listener(null);
        if (i != -1) {
            return;
        }
        this$0.updateImageList(arrayList != null ? arrayList : new ArrayList());
    }
}
