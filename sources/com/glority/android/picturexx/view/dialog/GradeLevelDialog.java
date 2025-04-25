package com.glority.android.picturexx.view.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cmsui2.entity.GradeItem;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogGradeLevelBinding;
import com.glority.android.picturexx.view.dialog.GradeLevelDialog;
import com.glority.android.xx.constants.LogEvents;
import com.glority.utils.stability.LogUtils;
import com.glority.widget.bottomsheet.GlBottomSheetBuilder;
import com.glority.widget.bottomsheet.GlBottomSheetDialog;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* compiled from: GradeLevelDialog.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001f B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00050\u000eJ(\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J8\u0010\u001b\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002¨\u0006!"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/GradeLevelDialog;", "", "<init>", "()V", "open", "", "context", "Landroid/content/Context;", "gradeItemList", "", "Lcom/glority/android/cmsui2/entity/GradeItem;", "currentGrade", "", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.LEVEL, "clickLevel", "levelAdapter", "Lcom/glority/android/picturexx/view/dialog/GradeLevelDialog$LevelAdapter;", "position", "", "displayNameAdapter", "Lcom/glority/android/picturexx/view/dialog/GradeLevelDialog$DisplayNameAdapter;", "binding", "Lcom/glority/android/picturexx/business/databinding/DialogGradeLevelBinding;", "clickName", "checkSaveButtonEnable", LogEvents.button, "Landroid/widget/Button;", "DisplayNameAdapter", "LevelAdapter", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class GradeLevelDialog {
    public static final int $stable = 0;
    public static final GradeLevelDialog INSTANCE = new GradeLevelDialog();

    private GradeLevelDialog() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, com.glority.android.picturexx.view.dialog.GradeLevelDialog$LevelAdapter] */
    public final void open(Context context, List<GradeItem> gradeItemList, String currentGrade, final Function1<? super String, Unit> callback) {
        int i;
        int i2;
        DisplayNameAdapter displayNameAdapter;
        Integer num;
        List split$default;
        List split$default2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gradeItemList, "gradeItemList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final List<GradeItem> filterNotNull = CollectionsKt.filterNotNull(gradeItemList);
        String str = (currentGrade == null || (split$default2 = StringsKt.split$default((CharSequence) currentGrade, new String[]{"-"}, false, 0, 6, (Object) null)) == null) ? null : (String) CollectionsKt.firstOrNull(split$default2);
        String str2 = (currentGrade == null || (split$default = StringsKt.split$default((CharSequence) currentGrade, new String[]{"-"}, false, 0, 6, (Object) null)) == null) ? null : (String) CollectionsKt.lastOrNull(split$default);
        final DialogGradeLevelBinding inflate = DialogGradeLevelBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        GradeItem gradeItem = (GradeItem) CollectionsKt.firstOrNull((List) filterNotNull);
        boolean z = (gradeItem != null ? gradeItem.getLevelList() : null) == null;
        final DisplayNameAdapter displayNameAdapter2 = new DisplayNameAdapter(z);
        inflate.nameRv.setAdapter(displayNameAdapter2);
        if (z) {
            RecyclerView levelRv = inflate.levelRv;
            Intrinsics.checkNotNullExpressionValue(levelRv, "levelRv");
            levelRv.setVisibility(8);
            inflate.nameRv.setBackground(new ColorDrawable(inflate.getRoot().getResources().getColor(R.color.white)));
        } else {
            objectRef.element = new LevelAdapter();
            inflate.levelRv.setAdapter((RecyclerView.Adapter) objectRef.element);
            ((LevelAdapter) objectRef.element).setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.GradeLevelDialog$open$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num2) {
                    invoke(baseQuickAdapter, view, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BaseQuickAdapter<?, ?> adapter, View view, int i3) {
                    Intrinsics.checkNotNullParameter(adapter, "adapter");
                    Intrinsics.checkNotNullParameter(view, "view");
                    GradeLevelDialog.INSTANCE.clickLevel(objectRef.element, i3, displayNameAdapter2, inflate);
                }
            });
        }
        List<GradeItem> list = filterNotNull;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Pair(((GradeItem) it.next()).getDisplayGradeName(context), false));
        }
        displayNameAdapter2.setNewData(arrayList);
        displayNameAdapter2.setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.GradeLevelDialog$open$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num2) {
                invoke(baseQuickAdapter, view, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> adapter, View view, int i3) {
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                GradeLevelDialog.INSTANCE.clickName(filterNotNull, displayNameAdapter2, i3, objectRef.element, inflate);
            }
        });
        Iterator<GradeItem> it2 = filterNotNull.iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else {
                if (Intrinsics.areEqual(it2.next().getShortNameId(), str)) {
                    i = i3;
                    break;
                }
                i3++;
            }
        }
        if (i != -1) {
            i2 = -1;
            displayNameAdapter = displayNameAdapter2;
            clickName(filterNotNull, displayNameAdapter2, i, (LevelAdapter) objectRef.element, inflate);
            List<Integer> levelList = filterNotNull.get(i).getLevelList();
            if (levelList != null) {
                Iterator<Integer> it3 = levelList.iterator();
                int i4 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (Intrinsics.areEqual(String.valueOf(it3.next()), str2)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                num = Integer.valueOf(i4);
            } else {
                num = null;
            }
            if ((num == null || num.intValue() != -1) && objectRef.element != 0 && num != null) {
                clickLevel((LevelAdapter) objectRef.element, num.intValue(), displayNameAdapter, inflate);
            }
        } else {
            i2 = -1;
            displayNameAdapter = displayNameAdapter2;
        }
        GlBottomSheetBuilder glBottomSheetBuilder = new GlBottomSheetBuilder(context);
        View root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        final GlBottomSheetDialog show = glBottomSheetBuilder.setCustomView(root).showDimBehind(true).show(3);
        Intrinsics.checkNotNull(show, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        GlBottomSheetDialog glBottomSheetDialog = show;
        glBottomSheetDialog.setDismissWithAnimation(true);
        glBottomSheetDialog.getBehavior().setDraggable(false);
        Window window = show.getWindow();
        if (window != null) {
            window.setLayout(i2, i2);
        }
        inflate.ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.dialog.GradeLevelDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GradeLevelDialog.open$lambda$3(GlBottomSheetDialog.this, view);
            }
        });
        MaterialButton saveBt = inflate.saveBt;
        Intrinsics.checkNotNullExpressionValue(saveBt, "saveBt");
        final DisplayNameAdapter displayNameAdapter3 = displayNameAdapter;
        ViewExtensionsKt.setSingleClickListener$default(saveBt, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.GradeLevelDialog$open$5
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it4) {
                Object obj;
                Object obj2;
                String str3;
                String str4;
                List<Pair<? extends String, ? extends Boolean>> data;
                Object obj3;
                Intrinsics.checkNotNullParameter(it4, "it");
                Iterator<T> it5 = GradeLevelDialog.DisplayNameAdapter.this.getData().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it5.next();
                        if (((Boolean) ((Pair) obj).getSecond()).booleanValue()) {
                            break;
                        }
                    }
                }
                Pair pair = (Pair) obj;
                String str5 = pair != null ? (String) pair.getFirst() : null;
                Iterator<T> it6 = filterNotNull.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it6.next();
                        if (Intrinsics.areEqual(((GradeItem) obj2).getDisplayGradeNameId(), str5)) {
                            break;
                        }
                    }
                }
                GradeItem gradeItem2 = (GradeItem) obj2;
                String shortNameId = gradeItem2 != null ? gradeItem2.getShortNameId() : null;
                GradeLevelDialog.LevelAdapter levelAdapter = objectRef.element;
                if (levelAdapter != null && (data = levelAdapter.getData()) != null) {
                    Iterator<T> it7 = data.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            obj3 = null;
                            break;
                        } else {
                            obj3 = it7.next();
                            if (((Boolean) ((Pair) obj3).getSecond()).booleanValue()) {
                                break;
                            }
                        }
                    }
                    Pair pair2 = (Pair) obj3;
                    if (pair2 != null) {
                        str3 = (String) pair2.getFirst();
                        str4 = shortNameId;
                        if (str4 == null && str4.length() != 0) {
                            String str6 = str3;
                            if (str6 != null && str6.length() != 0) {
                                if (StringsKt.toIntOrNull(str3) == null) {
                                    callback.invoke(shortNameId);
                                } else {
                                    callback.invoke(shortNameId + "-" + str3);
                                }
                            } else {
                                callback.invoke(shortNameId);
                            }
                            show.dismiss();
                            return;
                        }
                        callback.invoke(null);
                        show.dismiss();
                    }
                }
                str3 = null;
                str4 = shortNameId;
                if (str4 == null) {
                }
                callback.invoke(null);
                show.dismiss();
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void open$lambda$3(GlBottomSheetDialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clickLevel(LevelAdapter levelAdapter, int position, DisplayNameAdapter displayNameAdapter, DialogGradeLevelBinding binding) {
        List<Pair<? extends String, ? extends Boolean>> data = levelAdapter.getData();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
        int i = 0;
        for (Object obj : data) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new Pair(((Pair) obj).getFirst(), Boolean.valueOf(i == position)));
            i = i2;
        }
        levelAdapter.setNewData(arrayList);
        MaterialButton saveBt = binding.saveBt;
        Intrinsics.checkNotNullExpressionValue(saveBt, "saveBt");
        checkSaveButtonEnable(displayNameAdapter, saveBt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clickName(List<GradeItem> gradeItemList, DisplayNameAdapter displayNameAdapter, int position, LevelAdapter levelAdapter, DialogGradeLevelBinding binding) {
        String str;
        ArrayList arrayList;
        Iterator<T> it = gradeItemList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String displayGradeNameId = ((GradeItem) next).getDisplayGradeNameId();
            Pair<? extends String, ? extends Boolean> item = displayNameAdapter.getItem(position);
            if (Intrinsics.areEqual(displayGradeNameId, item != null ? item.getFirst() : null)) {
                str = next;
                break;
            }
        }
        GradeItem gradeItem = (GradeItem) str;
        if (gradeItem == null || (arrayList = gradeItem.getLevelList()) == null) {
            arrayList = new ArrayList();
        }
        if (levelAdapter != null) {
            List<Integer> list = arrayList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new Pair(GradeItem.INSTANCE.getLevelName(AppContext.INSTANCE.peekContext(), (Integer) it2.next()), false));
            }
            levelAdapter.setNewData(arrayList2);
        }
        List<Pair<? extends String, ? extends Boolean>> data = displayNameAdapter.getData();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
        int i = 0;
        for (Object obj : data) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList3.add(new Pair(((Pair) obj).getFirst(), Boolean.valueOf(i == position)));
            i = i2;
        }
        displayNameAdapter.setNewData(arrayList3);
        MaterialButton saveBt = binding.saveBt;
        Intrinsics.checkNotNullExpressionValue(saveBt, "saveBt");
        checkSaveButtonEnable(displayNameAdapter, saveBt);
    }

    private final void checkSaveButtonEnable(DisplayNameAdapter displayNameAdapter, Button button) {
        Object obj;
        Iterator<T> it = displayNameAdapter.getData().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Boolean) ((Pair) obj).getSecond()).booleanValue()) {
                    break;
                }
            }
        }
        boolean z = obj != null;
        button.setEnabled(z);
        button.setClickable(z);
    }

    /* compiled from: GradeLevelDialog.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0014R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/GradeLevelDialog$DisplayNameAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lkotlin/Pair;", "", "", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "noLevelList", "<init>", "(Z)V", "getNoLevelList", "()Z", "convert", "", "helper", "item", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class DisplayNameAdapter extends BaseQuickAdapter<Pair<? extends String, ? extends Boolean>, BaseViewHolder> {
        public static final int $stable = 0;
        private final boolean noLevelList;

        @Override // com.glority.android.adapterhelper.BaseQuickAdapter
        public /* bridge */ /* synthetic */ void convert(BaseViewHolder baseViewHolder, Pair<? extends String, ? extends Boolean> pair) {
            convert2(baseViewHolder, (Pair<String, Boolean>) pair);
        }

        public final boolean getNoLevelList() {
            return this.noLevelList;
        }

        public DisplayNameAdapter(boolean z) {
            super(R.layout.item_grade_displayname, null, 2, null);
            this.noLevelList = z;
        }

        /* renamed from: convert, reason: avoid collision after fix types in other method */
        protected void convert2(BaseViewHolder helper, Pair<String, Boolean> item) {
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            boolean z = false;
            if (item.getSecond().booleanValue()) {
                if (!this.noLevelList) {
                    helper.itemView.setBackgroundColor(helper.itemView.getResources().getColor(R.color.WhiteF8F8F8));
                }
                ((TextView) helper.getView(R.id.name_tv)).setTextColor(helper.itemView.getResources().getColor(R.color.colorAccent, helper.itemView.getContext().getTheme()));
                helper.setVisible(R.id.selected_v, !this.noLevelList);
                helper.setText(R.id.name_tv, item.getFirst());
            } else {
                helper.itemView.setBackgroundColor(helper.itemView.getResources().getColor(R.color.transparent));
                helper.setVisible(R.id.selected_v, false);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(item.getFirst());
                try {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(helper.itemView.getResources().getColor(R.color.gl_text_color3)), StringsKt.indexOf$default((CharSequence) item.getFirst(), "(", 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) item.getFirst(), ")", 0, false, 6, (Object) null) + 1, 33);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                }
                ((TextView) helper.getView(R.id.name_tv)).setTextColor(helper.itemView.getResources().getColor(R.color.gl_text_color1));
                ((TextView) helper.getView(R.id.name_tv)).setText(spannableStringBuilder);
            }
            int i = R.id.divider_v;
            if (this.noLevelList && getData().indexOf(item) != getData().size() - 1) {
                z = true;
            }
            helper.setGone(i, z);
        }
    }

    /* compiled from: GradeLevelDialog.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0014¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/GradeLevelDialog$LevelAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lkotlin/Pair;", "", "", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class LevelAdapter extends BaseQuickAdapter<Pair<? extends String, ? extends Boolean>, BaseViewHolder> {
        public static final int $stable = 0;

        @Override // com.glority.android.adapterhelper.BaseQuickAdapter
        public /* bridge */ /* synthetic */ void convert(BaseViewHolder baseViewHolder, Pair<? extends String, ? extends Boolean> pair) {
            convert2(baseViewHolder, (Pair<String, Boolean>) pair);
        }

        public LevelAdapter() {
            super(R.layout.item_grade_level, null, 2, null);
        }

        /* renamed from: convert, reason: avoid collision after fix types in other method */
        protected void convert2(BaseViewHolder helper, Pair<String, Boolean> item) {
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.getSecond().booleanValue()) {
                ((TextView) helper.getView(R.id.level_tv)).setTextColor(helper.itemView.getResources().getColor(R.color.colorAccent, helper.itemView.getContext().getTheme()));
                helper.setVisible(R.id.selected_v, true);
            } else {
                helper.setVisible(R.id.selected_v, false);
                ((TextView) helper.getView(R.id.level_tv)).setTextColor(helper.itemView.getResources().getColor(R.color.gl_text_color1));
            }
            ((TextView) helper.getView(R.id.level_tv)).setText(item.getFirst());
        }
    }
}
