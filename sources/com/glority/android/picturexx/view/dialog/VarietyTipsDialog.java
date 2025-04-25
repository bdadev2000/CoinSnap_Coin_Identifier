package com.glority.android.picturexx.view.dialog;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.cmsui2.bean.VarietyV2Entity;
import com.glority.android.cmsui2.bean.YearWithMintmarkV2;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogVarietyTipsBinding;
import com.glority.android.picturexx.js.BusinessJsWebviewBottomSheetFragment;
import com.glority.android.picturexx.repository.CmsRepository;
import com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsStaticUrl;
import com.glority.utils.stability.LogUtils;
import com.glority.widget.bottomsheet.GlBottomSheetBuilder;
import com.glority.widget.bottomsheet.GlBottomSheetDialog;
import com.glority.widget.wheelpicker.GlWheelPickerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VarietyTipsDialog.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J^\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f26\u0010\r\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00050\u000e¨\u0006\u0014"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/VarietyTipsDialog;", "", "<init>", "()V", "show", "", "context", "Landroidx/fragment/app/FragmentActivity;", "data", "", "Lcom/glority/android/cmsui2/bean/YearWithMintmarkV2;", "currentVarietyUid", "", "onDone", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", Args.year, "Lcom/glority/android/cmsui2/bean/VarietyV2Entity;", "variety", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class VarietyTipsDialog {
    public static final int $stable = 0;
    public static final VarietyTipsDialog INSTANCE = new VarietyTipsDialog();

    private VarietyTipsDialog() {
    }

    public final void show(final FragmentActivity context, final List<YearWithMintmarkV2> data, String currentVarietyUid, final Function2<? super String, ? super VarietyV2Entity, Unit> onDone) {
        Object obj;
        Object obj2;
        List<String> list;
        int i;
        List<VarietyV2Entity> varietyList;
        List<VarietyV2Entity> varietyList2;
        VarietyV2Entity varietyV2Entity;
        Object obj3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        try {
            final DialogVarietyTipsBinding inflate = DialogVarietyTipsBinding.inflate(LayoutInflater.from(context));
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            GlBottomSheetBuilder glBottomSheetBuilder = new GlBottomSheetBuilder(context);
            View root = inflate.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            final GlBottomSheetDialog show = glBottomSheetBuilder.setCustomView(root).showDimBehind(true).show(3);
            Iterator<T> it = data.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                List<VarietyV2Entity> varietyList3 = ((YearWithMintmarkV2) obj).getVarietyList();
                if (varietyList3 != null) {
                    Iterator<T> it2 = varietyList3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj3 = null;
                            break;
                        } else {
                            obj3 = it2.next();
                            if (Intrinsics.areEqual(((VarietyV2Entity) obj3).getVarietyUid(), currentVarietyUid)) {
                                break;
                            }
                        }
                    }
                    varietyV2Entity = (VarietyV2Entity) obj3;
                } else {
                    varietyV2Entity = null;
                }
                if (varietyV2Entity != null) {
                    break;
                }
            }
            YearWithMintmarkV2 yearWithMintmarkV2 = (YearWithMintmarkV2) obj;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it3 = data.iterator();
            while (it3.hasNext()) {
                List<VarietyV2Entity> varietyList4 = ((YearWithMintmarkV2) it3.next()).getVarietyList();
                if (varietyList4 != null) {
                    arrayList.addAll(varietyList4);
                }
            }
            List<YearWithMintmarkV2> list2 = data;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((YearWithMintmarkV2) it4.next()).getYear());
            }
            final List<String> list3 = CollectionsKt.toList(CollectionsKt.filterNotNull(arrayList2));
            inflate.wheel1.setData(list3);
            int indexOf = CollectionsKt.indexOf((List<? extends String>) list3, yearWithMintmarkV2 != null ? yearWithMintmarkV2.getYear() : null);
            if (indexOf == -1) {
                indexOf = 0;
            }
            inflate.wheel1.setSelectedItemPosition(indexOf, false);
            GlWheelPickerView glWheelPickerView = inflate.wheel2;
            Iterator<T> it5 = data.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it5.next();
                    if (Intrinsics.areEqual(((YearWithMintmarkV2) obj2).getYear(), CollectionsKt.getOrNull(list3, indexOf))) {
                        break;
                    }
                }
            }
            YearWithMintmarkV2 yearWithMintmarkV22 = (YearWithMintmarkV2) obj2;
            if (yearWithMintmarkV22 == null || (varietyList2 = yearWithMintmarkV22.getVarietyList()) == null) {
                list = null;
            } else {
                List<VarietyV2Entity> list4 = varietyList2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                Iterator<T> it6 = list4.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(((VarietyV2Entity) it6.next()).getMintmarkNoYear());
                }
                list = CollectionsKt.filterNotNull(arrayList3);
            }
            glWheelPickerView.setData(list);
            GlWheelPickerView glWheelPickerView2 = inflate.wheel2;
            if (yearWithMintmarkV2 != null && (varietyList = yearWithMintmarkV2.getVarietyList()) != null) {
                Iterator<VarietyV2Entity> it7 = varietyList.iterator();
                int i2 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        i = -1;
                        break;
                    } else {
                        if (Intrinsics.areEqual(it7.next().getVarietyUid(), currentVarietyUid)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                i = 0;
            }
            glWheelPickerView2.setSelectedItemPosition(i, false);
            inflate.wheel1.setOnItemSelectedListener(new GlWheelPickerView.OnItemSelectedListener() { // from class: com.glority.android.picturexx.view.dialog.VarietyTipsDialog$$ExternalSyntheticLambda0
                @Override // com.glority.widget.wheelpicker.GlWheelPickerView.OnItemSelectedListener
                public final void onItemSelected(GlWheelPickerView glWheelPickerView3, String str, int i3) {
                    VarietyTipsDialog.show$lambda$15$lambda$10(DialogVarietyTipsBinding.this, data, glWheelPickerView3, str, i3);
                }
            });
            inflate.tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.dialog.VarietyTipsDialog$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VarietyTipsDialog.show$lambda$15$lambda$11(GlBottomSheetDialog.this, view);
                }
            });
            inflate.tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.dialog.VarietyTipsDialog$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VarietyTipsDialog.show$lambda$15$lambda$14(list3, inflate, data, onDone, show, view);
                }
            });
            ImageView ivTips = inflate.ivTips;
            Intrinsics.checkNotNullExpressionValue(ivTips, "ivTips");
            ViewExtensionsKt.setSingleClickListener$default(ivTips, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.VarietyTipsDialog$show$1$8
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it8) {
                    Intrinsics.checkNotNullParameter(it8, "it");
                    BusinessJsWebviewBottomSheetFragment.Companion companion = BusinessJsWebviewBottomSheetFragment.Companion;
                    FragmentActivity fragmentActivity = FragmentActivity.this;
                    CmsStaticUrl staticUrlMessageByCache = CmsRepository.INSTANCE.getStaticUrlMessageByCache(null, CollectionDetailEditDialogFragment.VARIETY_TIP);
                    companion.open(fragmentActivity, staticUrlMessageByCache != null ? staticUrlMessageByCache.getLightUrl() : null, FragmentActivity.this.getString(R.string.id_price_variety), null);
                }
            }, 1, (Object) null);
            show.show();
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if (r1 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void show$lambda$15$lambda$10(com.glority.android.picturexx.business.databinding.DialogVarietyTipsBinding r0, java.util.List r1, com.glority.widget.wheelpicker.GlWheelPickerView r2, java.lang.String r3, int r4) {
        /*
            java.lang.String r2 = "$binding"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "$data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.glority.widget.wheelpicker.GlWheelPickerView r0 = r0.wheel2
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            r4 = r2
            com.glority.android.cmsui2.bean.YearWithMintmarkV2 r4 = (com.glority.android.cmsui2.bean.YearWithMintmarkV2) r4
            java.lang.String r4 = r4.getYear()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
            if (r4 == 0) goto L12
            goto L2b
        L2a:
            r2 = 0
        L2b:
            com.glority.android.cmsui2.bean.YearWithMintmarkV2 r2 = (com.glority.android.cmsui2.bean.YearWithMintmarkV2) r2
            if (r2 == 0) goto L66
            java.util.List r1 = r2.getVarietyList()
            if (r1 == 0) goto L66
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r3)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L48:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r1.next()
            com.glority.android.cmsui2.bean.VarietyV2Entity r3 = (com.glority.android.cmsui2.bean.VarietyV2Entity) r3
            java.lang.String r3 = r3.getMintmarkNoYear()
            r2.add(r3)
            goto L48
        L5c:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r1 = kotlin.collections.CollectionsKt.filterNotNull(r2)
            if (r1 != 0) goto L6d
        L66:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
        L6d:
            r0.setData(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.dialog.VarietyTipsDialog.show$lambda$15$lambda$10(com.glority.android.picturexx.business.databinding.DialogVarietyTipsBinding, java.util.List, com.glority.widget.wheelpicker.GlWheelPickerView, java.lang.String, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$15$lambda$11(GlBottomSheetDialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void show$lambda$15$lambda$14(List yearList, DialogVarietyTipsBinding binding, List data, Function2 onDone, GlBottomSheetDialog dialog, View view) {
        VarietyV2Entity varietyV2Entity;
        Object obj;
        List<VarietyV2Entity> varietyList;
        Intrinsics.checkNotNullParameter(yearList, "$yearList");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(onDone, "$onDone");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        String str = (String) yearList.get(binding.wheel1.getCurrentItemPosition());
        String str2 = binding.wheel2.getData().get(binding.wheel2.getCurrentItemPosition());
        Iterator it = data.iterator();
        while (true) {
            varietyV2Entity = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((YearWithMintmarkV2) obj).getYear(), str)) {
                    break;
                }
            }
        }
        YearWithMintmarkV2 yearWithMintmarkV2 = (YearWithMintmarkV2) obj;
        if (yearWithMintmarkV2 != null && (varietyList = yearWithMintmarkV2.getVarietyList()) != null) {
            Iterator<T> it2 = varietyList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.areEqual(((VarietyV2Entity) next).getMintmarkNoYear(), str2)) {
                    varietyV2Entity = next;
                    break;
                }
            }
            varietyV2Entity = varietyV2Entity;
        }
        if (varietyV2Entity != null) {
            onDone.invoke(str, varietyV2Entity);
        }
        dialog.dismiss();
    }
}
