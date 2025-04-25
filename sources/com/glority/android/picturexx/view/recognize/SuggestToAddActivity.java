package com.glority.android.picturexx.view.recognize;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseMultiItemQuickAdapter;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.adapterhelper.diff.BaseQuickDiffCallback;
import com.glority.android.adapterhelper.entity.BaseMultiEntity;
import com.glority.android.base.aws.s3.Scope;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.fileupload.FileUploadRequest;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ActivitySuggestAddBinding;
import com.glority.android.picturexx.view.recognize.SuggestToAddActivity;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.activity.XBaseActivity;
import com.glority.base.utils.FileHelper;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import com.glority.imagepicker.bean.ResultImage;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SuggestToAddActivity.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"#$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0006H\u0014J\b\u0010\u0014\u001a\u00020\tH\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0016\u0010\u0019\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001bH\u0002J\u0018\u0010\u001c\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001d\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010\u001eJ\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/SuggestToAddActivity;", "Lcom/glority/base/activity/XBaseActivity;", "Lcom/glority/android/picturexx/business/databinding/ActivitySuggestAddBinding;", "<init>", "()V", "MAX_IMAGE_SIZE", "", "commonNameList", "", "", "imageList", "Lcom/glority/android/adapterhelper/entity/BaseMultiEntity;", "imageSelectedList", "Ljava/util/ArrayList;", "Lcom/glority/imagepicker/bean/ResultImage;", "nameAdapter", "Lcom/glority/android/picturexx/view/recognize/SuggestToAddActivity$CommonNameAdapter;", "imageAdapter", "Lcom/glority/android/picturexx/view/recognize/SuggestToAddActivity$SuggestImageAdapter;", "getLayoutId", "getLogPageName", "initData", "", "initView", "binding", "updateImageList", "selectedImages", "", "uploadFilesToS3", "imageUri", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compressImage", "imageUris", "Landroid/net/Uri;", "SuggestImageAdapter", "CommonNameAdapter", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SuggestToAddActivity extends XBaseActivity<ActivitySuggestAddBinding> {
    private final int MAX_IMAGE_SIZE = 6;
    private final List<String> commonNameList;
    private final SuggestImageAdapter imageAdapter;
    private List<BaseMultiEntity> imageList;
    private ArrayList<ResultImage> imageSelectedList;
    private final CommonNameAdapter nameAdapter;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.glority.base.activity.XBaseActivity
    public void initData() {
    }

    public SuggestToAddActivity() {
        List<String> mutableListOf = CollectionsKt.mutableListOf("");
        this.commonNameList = mutableListOf;
        this.imageList = CollectionsKt.mutableListOf(new BaseMultiEntity(0, null, 2, null));
        this.imageSelectedList = new ArrayList<>();
        this.nameAdapter = new CommonNameAdapter(this, mutableListOf);
        this.imageAdapter = new SuggestImageAdapter(this.imageList);
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.activity_suggest_add;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.BaseActivity
    public String getLogPageName() {
        return LogEvents.suggesttoadd_page;
    }

    @Override // com.glority.base.activity.XBaseActivity
    public void initView(final ActivitySuggestAddBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        binding.toolBar.toolbar.setTitle("Suggest Snake to Add");
        binding.toolBar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.recognize.SuggestToAddActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuggestToAddActivity.initView$lambda$0(SuggestToAddActivity.this, view);
            }
        });
        binding.commonNameAdd.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.recognize.SuggestToAddActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuggestToAddActivity.initView$lambda$1(SuggestToAddActivity.this, view);
            }
        });
        binding.commonNameRecyclerview.setAdapter(this.nameAdapter);
        binding.uploadImageRecyclerview.setAdapter(this.imageAdapter);
        this.imageAdapter.setOnItemChildClickListener(new SuggestToAddActivity$initView$3(this));
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = System.currentTimeMillis();
        this.nameAdapter.setOnItemChildClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.recognize.SuggestToAddActivity$initView$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> adapter, View view, int i) {
                List list;
                List list2;
                SuggestToAddActivity.CommonNameAdapter commonNameAdapter;
                SuggestToAddActivity.CommonNameAdapter commonNameAdapter2;
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                if (view.getId() != R.id.delete_common_name || System.currentTimeMillis() - Ref.LongRef.this.element <= 600) {
                    return;
                }
                list = this.commonNameList;
                if (list.size() >= 2) {
                    list2 = this.commonNameList;
                    list2.remove(i);
                    commonNameAdapter = this.nameAdapter;
                    commonNameAdapter.notifyItemRemoved(i);
                    commonNameAdapter2 = this.nameAdapter;
                    commonNameAdapter2.notifyItemChanged(0);
                }
                Ref.LongRef.this.element = System.currentTimeMillis();
            }
        });
        binding.sendLayout.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.recognize.SuggestToAddActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuggestToAddActivity.initView$lambda$3(ActivitySuggestAddBinding.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SuggestToAddActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(SuggestToAddActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.commonNameList.add("");
        this$0.nameAdapter.notifyItemChanged(0);
        this$0.nameAdapter.notifyItemInserted(this$0.commonNameList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(ActivitySuggestAddBinding binding, SuggestToAddActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = binding.botanicalNameInput.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        boolean z = text.length() > 0;
        List<String> list = this$0.commonNameList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() > 0) {
                    break;
                }
            }
        }
        if (!z) {
            ToastUtils.showShort("Fill in at least one item of scientific name and common name", new Object[0]);
            return;
        }
        this$0.showProgress("", false);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new SuggestToAddActivity$initView$5$1(this$0, binding, new ArrayList(), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateImageList(List<? extends ResultImage> selectedImages) {
        this.imageSelectedList.clear();
        this.imageSelectedList.addAll(selectedImages);
        final ArrayList arrayList = new ArrayList();
        List<? extends ResultImage> list = selectedImages;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new BaseMultiEntity(1, ((ResultImage) it.next()).toString()));
        }
        ArrayList arrayList3 = arrayList2;
        if (arrayList3.size() >= this.MAX_IMAGE_SIZE) {
            arrayList.addAll(arrayList3);
        } else {
            arrayList.addAll(arrayList3);
            arrayList.add(new BaseMultiEntity(0, null, 2, null));
        }
        this.imageAdapter.setNewDiffData(new BaseQuickDiffCallback<BaseMultiEntity>(arrayList) { // from class: com.glority.android.picturexx.view.recognize.SuggestToAddActivity$updateImageList$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
            public boolean areContentsTheSame(BaseMultiEntity oldItem, BaseMultiEntity newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getItemType() == newItem.getItemType() && Intrinsics.areEqual(oldItem.getItem(), newItem.getItem());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
            public boolean areItemsTheSame(BaseMultiEntity oldItem, BaseMultiEntity newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(oldItem, newItem);
            }
        });
        this.imageList = arrayList;
        getBinding().uploadImageNumber.setText("Add images (" + selectedImages.size() + RemoteSettings.FORWARD_SLASH_STRING + this.MAX_IMAGE_SIZE + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object uploadFilesToS3(String str, Continuation<? super String> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        new FileUploadRequest(str, Scope.SUPPORT.getValue(), "suggesttoadd", PhotoFrom.ALBUM, null, 16, null).subscribe(new Consumer() { // from class: com.glority.android.picturexx.view.recognize.SuggestToAddActivity$uploadFilesToS3$2$1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Map<Long, String> map) {
                Continuation<String> continuation2 = safeContinuation2;
                synchronized (SuggestToAddActivity.class) {
                    String str2 = (String) CollectionsKt.firstOrNull(map.values());
                    if (str2 == null) {
                        str2 = "";
                    }
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m8274constructorimpl(str2));
                    Unit unit = Unit.INSTANCE;
                }
            }
        }, new Consumer() { // from class: com.glority.android.picturexx.view.recognize.SuggestToAddActivity$uploadFilesToS3$2$2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                Continuation<String> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m8274constructorimpl(null));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> compressImage(List<? extends Uri> imageUris) {
        String absolutePath;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = imageUris.iterator();
        while (it.hasNext()) {
            try {
                File cacheImageFile = FileHelper.INSTANCE.cacheImageFile(Glide.with((FragmentActivity) this).asBitmap().load((Uri) it.next()).submit(720, 960).get());
                if (cacheImageFile != null && (absolutePath = cacheImageFile.getAbsolutePath()) != null) {
                    Boolean.valueOf(arrayList.add(absolutePath));
                }
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SuggestToAddActivity.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/SuggestToAddActivity$SuggestImageAdapter;", "Lcom/glority/android/adapterhelper/BaseMultiItemQuickAdapter;", "Lcom/glority/android/adapterhelper/entity/BaseMultiEntity;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "", "<init>", "(Ljava/util/List;)V", "convert", "", "helper", "item", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class SuggestImageAdapter extends BaseMultiItemQuickAdapter<BaseMultiEntity, BaseViewHolder> {
        public static final int ITEM_TYPE_ADD = 0;
        public static final int ITEM_TYPE_IMAGE = 1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuggestImageAdapter(List<? extends BaseMultiEntity> data) {
            super(data);
            Intrinsics.checkNotNullParameter(data, "data");
            addItemType(0, R.layout.item_suggest_add);
            addItemType(1, R.layout.item_suggest_image);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.glority.android.adapterhelper.BaseQuickAdapter
        public void convert(BaseViewHolder helper, BaseMultiEntity item) {
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            int itemType = item.getItemType();
            if (itemType == 0) {
                helper.addOnClickListener(R.id.suggest_add_image);
                return;
            }
            if (itemType != 1) {
                return;
            }
            Object item2 = item.getItem();
            Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type kotlin.String");
            ImageView imageView = (ImageView) helper.getView(R.id.suggest_added_image);
            Glide.with(imageView).load((String) item2).into(imageView);
            helper.addOnClickListener(R.id.suggest_delete_picture);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SuggestToAddActivity.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/SuggestToAddActivity$CommonNameAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "dataList", "", "<init>", "(Lcom/glority/android/picturexx/view/recognize/SuggestToAddActivity;Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "convert", "", "helper", "item", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public final class CommonNameAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
        private final List<String> dataList;
        final /* synthetic */ SuggestToAddActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CommonNameAdapter(SuggestToAddActivity suggestToAddActivity, List<String> dataList) {
            super(R.layout.item_suggest_input, dataList);
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            this.this$0 = suggestToAddActivity;
            this.dataList = dataList;
        }

        public final List<String> getDataList() {
            return this.dataList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.glority.android.adapterhelper.BaseQuickAdapter
        public void convert(final BaseViewHolder helper, String item) {
            Intrinsics.checkNotNullParameter(helper, "helper");
            helper.addOnClickListener(R.id.delete_common_name);
            ((ImageView) helper.getView(R.id.delete_common_name)).setVisibility(getItemCount() == 1 ? 8 : 0);
            EditText editText = (EditText) helper.getView(R.id.input_common_name);
            if (item == null) {
                editText.requestFocus();
            }
            editText.setText(item);
            editText.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.view.recognize.SuggestToAddActivity$CommonNameAdapter$convert$lambda$1$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    SuggestToAddActivity.CommonNameAdapter.this.getDataList().set(helper.getPosition(), String.valueOf(s));
                }
            });
        }
    }

    /* compiled from: SuggestToAddActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/SuggestToAddActivity$Companion;", "", "<init>", "()V", "open", "", "context", "Landroid/content/Context;", "from", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(Context context, String from) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(from, "from");
            Intent intent = new Intent(context, (Class<?>) SuggestToAddActivity.class);
            intent.putExtra("from", from);
            context.startActivity(intent);
        }
    }
}
