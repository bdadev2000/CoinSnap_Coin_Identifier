package com.glority.android.picturexx.recognize.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import com.glority.android.base.aws.s3.AwsFileUploader;
import com.glority.android.base.aws.s3.Scope;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.recognize.R;
import com.glority.android.picturexx.recognize.analyzer.RecognizeProcess;
import com.glority.android.picturexx.recognize.databinding.FragmentResultBinding;
import com.glority.android.picturexx.recognize.vm.CoreViewModel;
import com.glority.android.picturexx.utils.RatingUtils;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.routers.GetS3ScopeRequest;
import com.glority.base.utils.HandOnBundleUtils;
import com.glority.utils.stability.LogUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ResultFragment.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000e\u001a\u00020\bH\u0002J\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u000e\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/glority/android/picturexx/recognize/fragment/ResultFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/recognize/databinding/FragmentResultBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/recognize/vm/CoreViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutId", "", "doCreateView", "loadData", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "uploadItemDetImage", "itemId", "", "", "getLogPageName", "", "saveRecognizeTime", "time", "Companion", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ResultFragment extends BaseFragment<FragmentResultBinding> {
    private static final String TAG = "ResultFragment";
    private CoreViewModel vm;

    @Override // com.glority.base.fragment.BaseFragment, com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        CoreViewModel coreViewModel = (CoreViewModel) getSharedViewModel(CoreViewModel.class);
        this.vm = coreViewModel;
        Pair<String, ? extends Object>[] pairArr = new Pair[2];
        if (coreViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            coreViewModel = null;
        }
        pairArr[0] = TuplesKt.to("from", coreViewModel.getCaptureFrom());
        CoreViewModel coreViewModel2 = this.vm;
        if (coreViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            coreViewModel2 = null;
        }
        RecognizeProcess recognizeProcess = coreViewModel2.getRecognizeProcess();
        pairArr[1] = TuplesKt.to("type", recognizeProcess != null ? recognizeProcess.typeName() : null);
        updateCommonEventArgs(pairArr);
        super.onCreate(savedInstanceState);
        FragmentActivity activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.addCallback(this, new OnBackPressedCallback() { // from class: com.glority.android.picturexx.recognize.fragment.ResultFragment$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                ViewExtensionsKt.finish(ResultFragment.this);
            }
        });
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_result;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        CoreViewModel coreViewModel = this.vm;
        if (coreViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            coreViewModel = null;
        }
        RecognizeProcess recognizeProcess = coreViewModel.getRecognizeProcess();
        if (recognizeProcess != null) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            int i = R.id.fcv;
            BaseRecognizeLoadingFragment<?> customLoadingFragment = recognizeProcess.customLoadingFragment();
            customLoadingFragment.setArguments(HandOnBundleUtils.INSTANCE.getHandOnBundleFromLast(this, (Bundle) null));
            Unit unit = Unit.INSTANCE;
            beginTransaction.replace(i, customLoadingFragment).commitNowAllowingStateLoss();
        }
        loadData();
    }

    private final void loadData() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new ResultFragment$loadData$1(this, null), 2, null);
    }

    @Override // com.glority.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.glority.base.presenter.IResultManager
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 12 && resultCode == -1) {
            String stringExtra = data != null ? data.getStringExtra("option") : null;
            if (Intrinsics.areEqual(stringExtra, "close")) {
                ViewExtensionsKt.finish(this);
            } else if (Intrinsics.areEqual(stringExtra, "reload")) {
                loadData();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uploadItemDetImage(List<Long> itemId) {
        final String absolutePath;
        int i = 0;
        for (Object obj : itemId) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final long longValue = ((Number) obj).longValue();
            try {
                CoreViewModel coreViewModel = this.vm;
                if (coreViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    coreViewModel = null;
                }
                File file = (File) CollectionsKt.getOrNull(coreViewModel.getCompressFiles(), i);
                if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                    AwsFileUploader awsFileUploader = AwsFileUploader.INSTANCE;
                    String result = new GetS3ScopeRequest().toResult();
                    if (result == null) {
                        result = Scope.ITEM.getValue();
                    }
                    awsFileUploader.uploadImageFile(absolutePath, result, new AwsFileUploader.ResultListener() { // from class: com.glority.android.picturexx.recognize.fragment.ResultFragment$uploadItemDetImage$1$1$1$1
                        @Override // com.glority.android.base.aws.s3.AwsFileUploader.ResultListener
                        public void onSuccess(String url) {
                            CoreViewModel coreViewModel2;
                            String str = url;
                            Log.e("ResultFragment", "uploadOriginalImage ".concat((str == null || str.length() == 0) ? "failed" : "success"));
                            coreViewModel2 = ResultFragment.this.vm;
                            if (coreViewModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("vm");
                                coreViewModel2 = null;
                            }
                            long j = longValue;
                            if (url == null) {
                                url = "";
                            }
                            coreViewModel2.uploadOriginalImage(j, url, absolutePath);
                        }

                        @Override // com.glority.android.base.aws.s3.AwsFileUploader.ResultListener
                        public void onError(String msg) {
                            Log.e("ResultFragment", "uploadOriginalImage  error " + msg);
                        }
                    });
                }
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
            i = i2;
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return "result_ignore";
    }

    public final void saveRecognizeTime(long time) {
        ArrayList arrayList = (ArrayList) PersistData.INSTANCE.get(RatingUtils.KEY_PRE_RECOGNIZE_TIME, new ArrayList());
        int intValue = ((Number) PersistData.INSTANCE.get("key_pre_recognize_count", -1)).intValue();
        if (intValue == -1) {
            PersistData.INSTANCE.set("key_pre_recognize_count", Integer.valueOf(arrayList.size() + 1));
        } else {
            PersistData.INSTANCE.set("key_pre_recognize_count", Integer.valueOf(intValue + 1));
        }
        if (arrayList.size() > 5) {
            arrayList.clear();
        }
        arrayList.add(Long.valueOf(time));
        PersistData.INSTANCE.set(RatingUtils.KEY_PRE_RECOGNIZE_TIME, arrayList);
    }
}
