package com.glority.android.picturexx.view.form;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.webkit.ProxyConfig;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.picturexx.adapter.AddEntity;
import com.glority.android.picturexx.adapter.AddImageAdapter;
import com.glority.android.picturexx.adapter.ImageEntity;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentConsultBinding;
import com.glority.android.ui.base.ContainerActivity;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.entity.BaseMultiEntity;
import com.glority.base.ext.ViewExtensionsKt;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.StringUtil;
import com.glority.imagepicker.utils.FileUtils;
import com.glority.widget.GlTextView;
import com.glority.widget.alert.GlAlert;
import com.glority.widget.alert.GlAlertOnClickListener;
import com.glority.widget.imagepager.GlNormalImagePagerActivity;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ConsultFragment.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0014J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\"\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0013H\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010#\u001a\u00020\u0011H\u0014J\b\u0010$\u001a\u00020\u0013H\u0002J\u001e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0(H\u0002J\u0018\u0010)\u001a\u0004\u0018\u00010\u00112\u0006\u0010*\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020\u00132\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0(H\u0002J-\u0010/\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00062\u000e\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u0011012\u0006\u00102\u001a\u000203H\u0016¢\u0006\u0002\u00104R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/glority/android/picturexx/view/form/ConsultFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentConsultBinding;", "<init>", "()V", "MAX_IMAGE_COUNT", "", "REQUEST_IMAGE_CAPTURE", "REQUEST_PERMISSION", "adapter", "Lcom/glority/android/picturexx/adapter/AddImageAdapter;", "imageList", "", "Lcom/glority/android/picturexx/adapter/ImageEntity;", "captureUri", "Landroid/net/Uri;", "headerImageUrl", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutId", "doCreateView", "dispatchTakePictureIntent", "context", "Landroid/content/Context;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "submit", "showSubmitSuccessDialog", "setUpImageData", "getLogPageName", "checkSubmitEnable", "uploadImage", "Lkotlinx/coroutines/flow/Flow;", "list", "", "uploadImageFile", "url", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addRedStar", "listOf", "Landroid/widget/TextView;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ConsultFragment extends BaseFragment<FragmentConsultBinding> {
    private Uri captureUri;
    private String headerImageUrl;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final int MAX_IMAGE_COUNT = 5;
    private final int REQUEST_IMAGE_CAPTURE = 3;
    private final int REQUEST_PERMISSION = 1;
    private final AddImageAdapter adapter = new AddImageAdapter();
    private List<ImageEntity> imageList = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentConsultBinding access$getBinding(ConsultFragment consultFragment) {
        return (FragmentConsultBinding) consultFragment.getBinding();
    }

    /* compiled from: ConsultFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/view/form/ConsultFragment$Companion;", "", "<init>", "()V", "open", "", "context", "Landroid/content/Context;", "headerImageUrl", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(Context context, String headerImageUrl) {
            Intrinsics.checkNotNullParameter(context, "context");
            ContainerActivity.INSTANCE.open(ConsultFragment.class).put(Args.imageUrls, headerImageUrl).launch(context);
        }
    }

    @Override // com.glority.base.fragment.BaseFragment, com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_consult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        this.headerImageUrl = arguments != null ? arguments.getString(Args.imageUrls) : null;
        ShapeableImageView headerIv = ((FragmentConsultBinding) getBinding()).headerIv;
        Intrinsics.checkNotNullExpressionValue(headerIv, "headerIv");
        ViewExtensionsKt.load(headerIv, this.headerImageUrl);
        ((FragmentConsultBinding) getBinding()).rv.setAdapter(this.adapter);
        addRedStar(CollectionsKt.listOf((Object[]) new GlTextView[]{((FragmentConsultBinding) getBinding()).emailTv, ((FragmentConsultBinding) getBinding()).noteTv}));
        EditText emailEt = ((FragmentConsultBinding) getBinding()).emailEt;
        Intrinsics.checkNotNullExpressionValue(emailEt, "emailEt");
        emailEt.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.view.form.ConsultFragment$doCreateView$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Drawable drawable;
                ConsultFragment.this.checkSubmitEnable();
                EditText editText = ConsultFragment.access$getBinding(ConsultFragment.this).emailEt;
                if (s != null && s.length() > 0 && !StringUtil.INSTANCE.isEmail(s.toString())) {
                    Resources resources = ConsultFragment.this.getResources();
                    int i = R.drawable.solid_f2f2f2_r_10_outline_red;
                    FragmentActivity activity = ConsultFragment.this.getActivity();
                    drawable = ResourcesCompat.getDrawable(resources, i, activity != null ? activity.getTheme() : null);
                } else {
                    Resources resources2 = ConsultFragment.this.getResources();
                    int i2 = R.drawable.solid_f2f2f2_r_10;
                    FragmentActivity activity2 = ConsultFragment.this.getActivity();
                    drawable = ResourcesCompat.getDrawable(resources2, i2, activity2 != null ? activity2.getTheme() : null);
                }
                editText.setBackground(drawable);
            }
        });
        EditText noteEt = ((FragmentConsultBinding) getBinding()).noteEt;
        Intrinsics.checkNotNullExpressionValue(noteEt, "noteEt");
        noteEt.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.view.form.ConsultFragment$doCreateView$$inlined$addTextChangedListener$default$2
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                ConsultFragment.access$getBinding(ConsultFragment.this).noteCountTv.setText((s != null ? s.length() : 0) + "/5000");
                ConsultFragment.this.checkSubmitEnable();
            }
        });
        ((FragmentConsultBinding) getBinding()).submitBtn.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.form.ConsultFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConsultFragment.doCreateView$lambda$2(ConsultFragment.this, view);
            }
        });
        this.adapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() { // from class: com.glority.android.picturexx.view.form.ConsultFragment$doCreateView$4
            private long currentTime = System.currentTimeMillis();

            @Override // com.glority.android.adapterhelper.BaseQuickAdapter.OnItemChildClickListener
            public void onItemChildClick(BaseQuickAdapter<?, ?> adapter, View view, int position) {
                List list;
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                if (System.currentTimeMillis() - this.currentTime < 500) {
                    return;
                }
                this.currentTime = System.currentTimeMillis();
                int id = view.getId();
                if (id == R.id.iv_close1) {
                    com.glority.android.ui.base.v2.BaseFragment.logEvent$default(ConsultFragment.this, LogEvents.addcollectionpopview_imagedelete_click, null, 2, null);
                    Object orNull = CollectionsKt.getOrNull(adapter.getData(), position);
                    ImageEntity imageEntity = orNull instanceof ImageEntity ? (ImageEntity) orNull : null;
                    if (imageEntity == null) {
                        return;
                    }
                    list = ConsultFragment.this.imageList;
                    list.remove(imageEntity);
                    ConsultFragment.this.setUpImageData();
                    return;
                }
                if (id == R.id.iv) {
                    List<?> data = adapter.getData();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : data) {
                        if (obj instanceof ImageEntity) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((ImageEntity) it.next()).getUrl().toString());
                    }
                    String[] strArr = (String[]) arrayList3.toArray(new String[0]);
                    GlNormalImagePagerActivity.Companion companion = GlNormalImagePagerActivity.Companion;
                    Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    companion.open(context, strArr, position);
                    return;
                }
                if (id == R.id.add_bt) {
                    com.glority.android.ui.base.v2.BaseFragment.logEvent$default(ConsultFragment.this, LogEvents.addcollectionpopview_imageadd_click, null, 2, null);
                    ConsultFragment consultFragment = ConsultFragment.this;
                    Context context2 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    consultFragment.dispatchTakePictureIntent(context2);
                }
            }
        });
        ((FragmentConsultBinding) getBinding()).toolBar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.form.ConsultFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConsultFragment.doCreateView$lambda$3(ConsultFragment.this, view);
            }
        });
        ((FragmentConsultBinding) getBinding()).toolBar.toolbar.setTitle(R.string.errorcoin_askexpert_pagetitle);
        setUpImageData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$2(ConsultFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.submit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$3(ConsultFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchTakePictureIntent(Context context) {
        try {
            if (Build.VERSION.SDK_INT < 29 && (ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") != 0 || ContextCompat.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                requestPermissions((String[]) CollectionsKt.listOf((Object[]) new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}).toArray(new String[0]), this.REQUEST_PERMISSION);
                return;
            }
            if (ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") != 0) {
                requestPermissions((String[]) CollectionsKt.listOf("android.permission.CAMERA").toArray(new String[0]), this.REQUEST_PERMISSION);
                return;
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            Uri createEmptyUri = FileUtils.createEmptyUri(context);
            this.captureUri = createEmptyUri;
            intent.putExtra("output", createEmptyUri);
            intent.addFlags(1);
            startActivityForResult(intent, this.REQUEST_IMAGE_CAPTURE);
        } catch (Throwable unused) {
        }
    }

    @Override // com.glority.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.glority.base.presenter.IResultManager
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Uri uri;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == this.REQUEST_IMAGE_CAPTURE && resultCode == -1 && (uri = this.captureUri) != null) {
            this.imageList.add(new ImageEntity(uri));
            setUpImageData();
        }
    }

    private final void submit() {
        ConsultFragment consultFragment = this;
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(consultFragment, LogEvents.consult_submit_click, null, 2, null);
        com.glority.android.ui.base.v2.BaseFragment.showProgress$default(consultFragment, null, false, 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new ConsultFragment$submit$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSubmitSuccessDialog() {
        Context context = getContext();
        if (context != null) {
            GlAlert.Builder.setPositiveButton$default(new GlAlert.Builder(context, GlAlert.DialogStyle.SYSTEM, 0, 4, null).setTitle(R.string.errorcoin_askexpert_popuptitle).setMessage(R.string.errorcoin_askexpert_popupcontent), R.string.universal_get, new GlAlertOnClickListener() { // from class: com.glority.android.picturexx.view.form.ConsultFragment$showSubmitSuccessDialog$1$1
                @Override // com.glority.widget.alert.GlAlertOnClickListener
                public void onClick(AlertDialog glAlert) {
                    Intrinsics.checkNotNullParameter(glAlert, "glAlert");
                    glAlert.dismiss();
                    com.glority.android.core.ext.ViewExtensionsKt.finish(ConsultFragment.this);
                }
            }, (GlAlert.ButtonStyle) null, 4, (Object) null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpImageData() {
        final ArrayList arrayList = new ArrayList(this.imageList);
        if (arrayList.size() < this.MAX_IMAGE_COUNT) {
            arrayList.add(new AddEntity());
        }
        this.adapter.setNewDiffData(new BaseMultiEntity.BaseMultiDiffCallback(arrayList) { // from class: com.glority.android.picturexx.view.form.ConsultFragment$setUpImageData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(arrayList);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.glority.base.entity.BaseMultiEntity.BaseMultiDiffCallback, com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
            public boolean areItemsTheSame(BaseMultiEntity oldItem, BaseMultiEntity newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return super.areItemsTheSame(oldItem, newItem) && !((oldItem instanceof ImageEntity) && (newItem instanceof ImageEntity) && !Intrinsics.areEqual(((ImageEntity) oldItem).getUrl(), ((ImageEntity) newItem).getUrl()));
            }
        });
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected String getLogPageName() {
        return LogEvents.errorcoinconsult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void checkSubmitEnable() {
        String obj = ((FragmentConsultBinding) getBinding()).emailEt.getText().toString();
        ((FragmentConsultBinding) getBinding()).submitBtn.setEnabled(obj.length() > 0 && ((FragmentConsultBinding) getBinding()).noteEt.getText().toString().length() > 0 && StringUtil.INSTANCE.isEmail(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<String> uploadImage(List<ImageEntity> list) {
        return FlowKt.flow(new ConsultFragment$uploadImage$1(list, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object uploadImageFile(android.net.Uri r12, kotlin.coroutines.Continuation<? super java.lang.String> r13) {
        /*
            r11 = this;
            kotlin.coroutines.SafeContinuation r0 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r13)
            r0.<init>(r1)
            r1 = r0
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.String r2 = r12.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L1e
            goto L30
        L1e:
            java.lang.String r2 = r12.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4 = 2
            r5 = 0
            java.lang.String r6 = "http"
            r7 = 0
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r2, r6, r7, r4, r5)
            if (r2 == 0) goto L3e
        L30:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.String r12 = r12.toString()
            java.lang.Object r12 = kotlin.Result.m8274constructorimpl(r12)
            r1.resumeWith(r12)
            goto L77
        L3e:
            com.glority.android.core.route.fileupload.FileUploadRequest r10 = new com.glority.android.core.route.fileupload.FileUploadRequest
            java.lang.String r2 = com.glority.utils.store.FileUtils.getFilePath(r12)
            if (r2 != 0) goto L4f
            java.lang.String r12 = r12.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
            r3 = r12
            goto L50
        L4f:
            r3 = r2
        L50:
            com.glority.android.base.aws.s3.Scope r12 = com.glority.android.base.aws.s3.Scope.COLLECTION_ORIGINAL
            java.lang.String r4 = r12.getValue()
            com.glority.android.picturexx.s3.ItemType r12 = com.glority.android.picturexx.s3.ItemType.ITEM_ADD_COLLECTION_DETAIL
            java.lang.String r5 = r12.getItemType()
            com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom r6 = com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom.ALBUM
            r8 = 16
            r9 = 0
            r7 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            com.glority.android.picturexx.view.form.ConsultFragment$uploadImageFile$2$1 r12 = new com.glority.android.picturexx.view.form.ConsultFragment$uploadImageFile$2$1
            r12.<init>()
            io.reactivex.functions.Consumer r12 = (io.reactivex.functions.Consumer) r12
            com.glority.android.picturexx.view.form.ConsultFragment$uploadImageFile$2$2 r2 = new com.glority.android.picturexx.view.form.ConsultFragment$uploadImageFile$2$2
            r2.<init>()
            io.reactivex.functions.Consumer r2 = (io.reactivex.functions.Consumer) r2
            r10.subscribe(r12, r2)
        L77:
            java.lang.Object r12 = r0.getOrThrow()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r12 != r0) goto L84
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r13)
        L84:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.form.ConsultFragment.uploadImageFile(android.net.Uri, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void addRedStar(List<? extends TextView> listOf) {
        for (TextView textView : listOf) {
            String obj = textView.getText().toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(obj + ProxyConfig.MATCH_ALL_SCHEMES);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FF6666")), obj.length(), spannableStringBuilder.length(), 34);
            textView.setText(spannableStringBuilder);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Context context;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (grantResults.length == permissions.length && requestCode == this.REQUEST_PERMISSION && (context = getContext()) != null) {
            dispatchTakePictureIntent(context);
        }
    }
}
