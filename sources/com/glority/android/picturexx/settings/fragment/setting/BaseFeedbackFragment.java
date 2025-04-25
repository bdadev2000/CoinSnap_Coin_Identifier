package com.glority.android.picturexx.settings.fragment.setting;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.webkit.ProxyConfig;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseMultiItemQuickAdapter;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.databinding.FragmentFeedbackBinding;
import com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment;
import com.glority.base.entity.BaseMultiEntity;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.ImagePicker;
import com.glority.base.utils.MaxLengthWatcher;
import com.glority.utils.app.ResUtils;
import com.glority.utils.data.RegexUtils;
import com.glority.utils.device.NetworkUtils;
import com.glority.utils.ui.ToastUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseFeedbackFragment.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004#$%&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H&J\b\u0010\u0012\u001a\u00020\u000fH&J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH&J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH&J\b\u0010\u0017\u001a\u00020\rH&J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0012\u0010\u001e\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001f\u001a\u00020\rH\u0002J\b\u0010 \u001a\u00020\rH\u0002J\b\u0010!\u001a\u00020\rH\u0002J\b\u0010\"\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/setting/BaseFeedbackFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/settings/databinding/FragmentFeedbackBinding;", "<init>", "()V", "imageList", "", "Landroid/net/Uri;", "adapter", "Lcom/glority/android/picturexx/settings/fragment/setting/BaseFeedbackFragment$Adapter;", "imagePicker", "Lcom/glority/base/utils/ImagePicker;", "onSubmit", "", "content", "", "contact", "", "getTitle", "getContactTip", "getContactHint", "getContentTip", "getContentHint", "onBack", "getLayoutId", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "doCreateView", "onActivityCreated", "initToolbar", "initView", "initListener", "setUpImageData", "Companion", "Adapter", "ImageEntity", "AddEntity", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public abstract class BaseFeedbackFragment extends BaseFragment<FragmentFeedbackBinding> {
    private static final int MAX_IMAGE_COUNT = 3;
    private static final int MAX_MESSAGE_LENGTH = 500;
    private ImagePicker imagePicker;
    private final List<Uri> imageList = new ArrayList();
    private final Adapter adapter = new Adapter();

    public abstract String getContactHint();

    public abstract String getContentHint();

    public abstract String getTitle();

    public abstract void onBack();

    public abstract void onSubmit(String content, String contact, List<? extends Uri> imageList);

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentFeedbackBinding access$getBinding(BaseFeedbackFragment baseFeedbackFragment) {
        return (FragmentFeedbackBinding) baseFeedbackFragment.getBinding();
    }

    public String getContactTip() {
        String string = ResUtils.getString(R.string.text_your_email_address);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public String getContentTip() {
        String string = ResUtils.getString(R.string.text_description);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_feedback;
    }

    @Override // com.glority.base.fragment.BaseFragment, com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        this.imagePicker = new ImagePicker(this, 3);
        super.onCreate(savedInstanceState);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    public void doCreateView(Bundle savedInstanceState) {
        initToolbar();
        initView();
        initListener();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        Window window;
        super.onActivityCreated(savedInstanceState);
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initToolbar() {
        View findViewById = ((FragmentFeedbackBinding) getBinding()).naviBar.getRoot().findViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        Toolbar toolbar = (Toolbar) findViewById;
        toolbar.setTitle(getTitle());
        toolbar.setNavigationIcon(R.drawable.arrow_back_black);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseFeedbackFragment.initToolbar$lambda$0(BaseFeedbackFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initToolbar$lambda$0(BaseFeedbackFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBack();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ProxyConfig.MATCH_ALL_SCHEMES + getContentTip());
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ResUtils.getColor(R.color.Red)), 0, 1, 33);
        ((FragmentFeedbackBinding) getBinding()).tvContentTip.setText(spannableStringBuilder);
        ((FragmentFeedbackBinding) getBinding()).etContent.setHint(getContentHint());
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getContactTip());
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(ResUtils.getColor(R.color.Red)), 0, 1, 33);
        ((FragmentFeedbackBinding) getBinding()).tvContactTip.setText(spannableStringBuilder2);
        ((FragmentFeedbackBinding) getBinding()).etContact.setHint(getContactHint());
        ((FragmentFeedbackBinding) getBinding()).rvImage.setAdapter(this.adapter);
        ((FragmentFeedbackBinding) getBinding()).rvImage.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        setUpImageData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initListener() {
        Button btnFeedbackSend = ((FragmentFeedbackBinding) getBinding()).btnFeedbackSend;
        Intrinsics.checkNotNullExpressionValue(btnFeedbackSend, "btnFeedbackSend");
        ViewExtensionsKt.setSingleClickListener$default(btnFeedbackSend, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment$initListener$1
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
            public final void invoke2(View it) {
                List<? extends Uri> list;
                FragmentActivity activity;
                Window window;
                View decorView;
                IBinder windowToken;
                Intrinsics.checkNotNullParameter(it, "it");
                FragmentActivity activity2 = BaseFeedbackFragment.this.getActivity();
                Object systemService = activity2 != null ? activity2.getSystemService("input_method") : null;
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null && (activity = BaseFeedbackFragment.this.getActivity()) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (windowToken = decorView.getWindowToken()) != null) {
                    inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
                }
                if (!NetworkUtils.isConnected()) {
                    ToastUtils.showShort(R.string.error_text_connect_fail);
                    return;
                }
                String valueOf = String.valueOf(BaseFeedbackFragment.access$getBinding(BaseFeedbackFragment.this).etContent.getText());
                String obj = BaseFeedbackFragment.access$getBinding(BaseFeedbackFragment.this).etContact.getText().toString();
                if (valueOf.length() == 0) {
                    ToastUtils.showShort(R.string.feedback_text_empty_tip);
                    return;
                }
                if (!RegexUtils.isEmail(obj)) {
                    ToastUtils.showShort(R.string.text_invalid_email_address_title);
                } else {
                    if (!NetworkUtils.isConnected()) {
                        ToastUtils.showShort(R.string.error_connect_fail_try_again);
                        return;
                    }
                    BaseFeedbackFragment baseFeedbackFragment = BaseFeedbackFragment.this;
                    list = baseFeedbackFragment.imageList;
                    baseFeedbackFragment.onSubmit(valueOf, obj, list);
                }
            }
        }, 1, (Object) null);
        ((FragmentFeedbackBinding) getBinding()).etContent.addTextChangedListener(new MaxLengthWatcher(500, ((FragmentFeedbackBinding) getBinding()).etContent, getActivity()));
        this.adapter.setOnItemChildClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment$initListener$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, int i) {
                ImagePicker imagePicker;
                List list;
                Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "view");
                int id = view.getId();
                if (id == R.id.iv_close) {
                    list = BaseFeedbackFragment.this.imageList;
                    list.remove(i);
                    BaseFeedbackFragment.this.setUpImageData();
                } else if (id == R.id.cl_add_images) {
                    imagePicker = BaseFeedbackFragment.this.imagePicker;
                    if (imagePicker == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("imagePicker");
                        imagePicker = null;
                    }
                    final BaseFeedbackFragment baseFeedbackFragment = BaseFeedbackFragment.this;
                    imagePicker.pick(new ImagePicker.OnImageSelectedListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment$initListener$2.1
                        @Override // com.glority.base.utils.ImagePicker.OnImageSelectedListener
                        public void onImageSelected(List<? extends Uri> uris) {
                            List list2;
                            List list3;
                            List list4;
                            List list5;
                            List list6;
                            List list7;
                            List list8;
                            Intrinsics.checkNotNullParameter(uris, "uris");
                            list2 = BaseFeedbackFragment.this.imageList;
                            list2.addAll(uris);
                            list3 = BaseFeedbackFragment.this.imageList;
                            if (list3.size() > 3) {
                                list4 = BaseFeedbackFragment.this.imageList;
                                list5 = BaseFeedbackFragment.this.imageList;
                                int size = list5.size() - 3;
                                list6 = BaseFeedbackFragment.this.imageList;
                                List mutableList = CollectionsKt.toMutableList((Collection) list4.subList(size, list6.size()));
                                list7 = BaseFeedbackFragment.this.imageList;
                                list7.clear();
                                list8 = BaseFeedbackFragment.this.imageList;
                                list8.addAll(mutableList);
                            }
                            BaseFeedbackFragment.this.setUpImageData();
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setUpImageData() {
        ((FragmentFeedbackBinding) getBinding()).tvImageCount.setText(new SpannableStringBuilder(ResUtils.getString(R.string.feedback_text_add_images) + "(" + this.imageList.size() + "/3)"));
        final ArrayList arrayList = new ArrayList();
        List<Uri> list = this.imageList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(Boolean.valueOf(arrayList.add(new ImageEntity((Uri) it.next()))));
        }
        if (arrayList.size() < 3) {
            arrayList.add(new AddEntity());
        }
        this.adapter.setNewDiffData(new BaseMultiEntity.BaseMultiDiffCallback(arrayList) { // from class: com.glority.android.picturexx.settings.fragment.setting.BaseFeedbackFragment$setUpImageData$2
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.glority.base.entity.BaseMultiEntity.BaseMultiDiffCallback, com.glority.android.adapterhelper.diff.BaseQuickDiffCallback
            public boolean areItemsTheSame(BaseMultiEntity oldItem, BaseMultiEntity newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return super.areItemsTheSame(oldItem, newItem) && !((oldItem instanceof BaseFeedbackFragment.ImageEntity) && (newItem instanceof BaseFeedbackFragment.ImageEntity) && !Intrinsics.areEqual(((BaseFeedbackFragment.ImageEntity) oldItem).getUrl(), ((BaseFeedbackFragment.ImageEntity) newItem).getUrl()));
            }
        });
        this.adapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseFeedbackFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/setting/BaseFeedbackFragment$Adapter;", "Lcom/glority/android/adapterhelper/BaseMultiItemQuickAdapter;", "Lcom/glority/base/entity/BaseMultiEntity;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "<init>", "(Lcom/glority/android/picturexx/settings/fragment/setting/BaseFeedbackFragment;)V", "convert", "", "helper", "item", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public final class Adapter extends BaseMultiItemQuickAdapter<BaseMultiEntity, BaseViewHolder> {
        public Adapter() {
            super(CollectionsKt.emptyList());
            addItemType(0, R.layout.list_item_vip_support_image);
            addItemType(1, R.layout.list_item_vip_support_add_image);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.glority.android.adapterhelper.BaseQuickAdapter
        public void convert(BaseViewHolder helper, BaseMultiEntity item) {
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            View view = helper.itemView;
            if (item instanceof ImageEntity) {
                Glide.with(view).load(((ImageEntity) item).getUrl()).thumbnail(0.1f).into((ImageView) helper.getView(R.id.iv));
                helper.addOnClickListener(R.id.iv_close);
            } else if (item instanceof AddEntity) {
                helper.addOnClickListener(R.id.cl_add_images);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseFeedbackFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/setting/BaseFeedbackFragment$ImageEntity;", "Lcom/glority/base/entity/BaseMultiEntity;", "url", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUrl", "()Landroid/net/Uri;", "equals", "", "other", "", "hashCode", "", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class ImageEntity extends BaseMultiEntity {
        private final Uri url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageEntity(Uri url) {
            super(0, null, 2, null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final Uri getUrl() {
            return this.url;
        }

        @Override // com.glority.base.entity.BaseMultiEntity
        public boolean equals(Object other) {
            if (super.equals(other)) {
                Uri uri = this.url;
                ImageEntity imageEntity = other instanceof ImageEntity ? (ImageEntity) other : null;
                if (Intrinsics.areEqual(uri, imageEntity != null ? imageEntity.url : null)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.glority.base.entity.BaseMultiEntity
        public int hashCode() {
            return (super.hashCode() * 31) + this.url.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseFeedbackFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/setting/BaseFeedbackFragment$AddEntity;", "Lcom/glority/base/entity/BaseMultiEntity;", "<init>", "()V", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class AddEntity extends BaseMultiEntity {
        public AddEntity() {
            super(1, null, 2, null);
        }
    }
}
