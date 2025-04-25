package com.glority.android.picturexx.settings.fragment.setting;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.navigation.fragment.FragmentKt;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.settings.R;
import com.glority.android.picturexx.settings.databinding.FragmentProfileBinding;
import com.glority.android.picturexx.settings.logevents.SettingsLogEvents;
import com.glority.android.picturexx.settings.vm.ProfileViewModel;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.FileHelper;
import com.glority.base.utils.ImagePicker;
import com.glority.base.utils.data.DefaultResponseHandler;
import com.glority.base.utils.data.ResponseUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.GetUserMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.UpdateMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.network.model.Resource;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.google.android.gms.common.Scopes;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileFragment.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0002J&\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\u0014\u0010\u001a\u001a\u00020\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/glority/android/picturexx/settings/fragment/setting/ProfileFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/settings/databinding/FragmentProfileBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/settings/vm/ProfileViewModel;", "avatar", "Landroid/net/Uri;", "imagePicker", "Lcom/glority/base/utils/ImagePicker;", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "doCreateView", "initToolbar", "initView", "nickname", "", "avatarUrl", "email", "initListener", "addSubscription", "updateProfile", "image", "Ljava/io/File;", "onDestroy", "getLogPageName", "settings_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ProfileFragment extends BaseFragment<FragmentProfileBinding> {
    private Uri avatar;
    private ImagePicker imagePicker;
    private ProfileViewModel vm;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentProfileBinding access$getBinding(ProfileFragment profileFragment) {
        return (FragmentProfileBinding) profileFragment.getBinding();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_profile;
    }

    @Override // com.glority.base.fragment.BaseFragment, com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        this.imagePicker = new ImagePicker(this, 1);
        super.onCreate(savedInstanceState);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        ProfileFragment profileFragment = this;
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(profileFragment, SettingsLogEvents.Edit_Profile_Page, null, 2, null);
        ProfileViewModel profileViewModel = (ProfileViewModel) getViewModel(ProfileViewModel.class);
        this.vm = profileViewModel;
        if (profileViewModel == null) {
            ViewExtensionsKt.navigateUp(this);
        }
        initToolbar();
        initListener();
        addSubscription();
        ProfileViewModel profileViewModel2 = this.vm;
        if (profileViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            profileViewModel2 = null;
        }
        profileViewModel2.getUserProfile();
        com.glority.android.ui.base.v2.BaseFragment.showProgress$default(profileFragment, null, false, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initToolbar() {
        View findViewById = ((FragmentProfileBinding) getBinding()).naviBar.getRoot().findViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        Toolbar toolbar = (Toolbar) findViewById;
        toolbar.setTitle(R.string.edit_profile_text_title);
        toolbar.setNavigationIcon(R.drawable.arrow_back_black);
        toolbar.inflateMenu(R.menu.save_menu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.ProfileFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileFragment.initToolbar$lambda$0(ProfileFragment.this, view);
            }
        });
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.ProfileFragment$$ExternalSyntheticLambda3
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean initToolbar$lambda$1;
                initToolbar$lambda$1 = ProfileFragment.initToolbar$lambda$1(ProfileFragment.this, menuItem);
                return initToolbar$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initToolbar$lambda$0(ProfileFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initToolbar$lambda$1(final ProfileFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, SettingsLogEvents.Edit_Profile_Save, null, 2, null);
        Uri uri = this$0.avatar;
        if (uri != null) {
            Intrinsics.checkNotNullExpressionValue(Glide.with(this$0).asBitmap().load(uri).centerCrop().circleCrop().placeholder(R.drawable.default_portrait).into((RequestBuilder) new SimpleTarget<Bitmap>() { // from class: com.glority.android.picturexx.settings.fragment.setting.ProfileFragment$initToolbar$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(350, 350);
                }

                @Override // com.bumptech.glide.request.target.Target
                public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
                    onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
                }

                public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
                    Intrinsics.checkNotNullParameter(resource, "resource");
                    File cacheImageFile = FileHelper.INSTANCE.cacheImageFile(resource);
                    if (cacheImageFile == null) {
                        return;
                    }
                    ProfileFragment.this.updateProfile(cacheImageFile);
                }
            }), "into(...)");
        } else {
            updateProfile$default(this$0, null, 1, null);
            Unit unit = Unit.INSTANCE;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void initView(String nickname, String avatarUrl, String email) {
        EditText editText = ((FragmentProfileBinding) getBinding()).etName;
        if (nickname == null) {
            nickname = "";
        }
        editText.setText(nickname);
        ((FragmentProfileBinding) getBinding()).etEmail.setText(email != null ? email : "");
        String str = email;
        ((FragmentProfileBinding) getBinding()).clEmailContainer.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        Glide.with(this).asBitmap().load(avatarUrl).centerCrop().circleCrop().placeholder(R.drawable.default_portrait).into(((FragmentProfileBinding) getBinding()).ivAvatar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initListener() {
        ImageView ivAvatar = ((FragmentProfileBinding) getBinding()).ivAvatar;
        Intrinsics.checkNotNullExpressionValue(ivAvatar, "ivAvatar");
        ViewExtensionsKt.setSingleClickListener(ivAvatar, 600L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.settings.fragment.setting.ProfileFragment$initListener$1
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
                ImagePicker imagePicker;
                Intrinsics.checkNotNullParameter(it, "it");
                ImagePicker imagePicker2 = null;
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(ProfileFragment.this, SettingsLogEvents.Edit_Profile_Avatar, null, 2, null);
                imagePicker = ProfileFragment.this.imagePicker;
                if (imagePicker == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imagePicker");
                } else {
                    imagePicker2 = imagePicker;
                }
                final ProfileFragment profileFragment = ProfileFragment.this;
                imagePicker2.pick(new ImagePicker.OnImageSelectedListener() { // from class: com.glority.android.picturexx.settings.fragment.setting.ProfileFragment$initListener$1.1
                    @Override // com.glority.base.utils.ImagePicker.OnImageSelectedListener
                    public void onImageSelected(List<? extends Uri> uris) {
                        Intrinsics.checkNotNullParameter(uris, "uris");
                        Uri uri = (Uri) CollectionsKt.first((List) uris);
                        ProfileFragment.this.avatar = uri;
                        Glide.with(ProfileFragment.this).asBitmap().load(uri).centerCrop().circleCrop().placeholder(R.drawable.default_portrait).into(ProfileFragment.access$getBinding(ProfileFragment.this).ivAvatar);
                    }
                });
            }
        });
    }

    private final void addSubscription() {
        ProfileViewModel profileViewModel = this.vm;
        ProfileViewModel profileViewModel2 = null;
        if (profileViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            profileViewModel = null;
        }
        ProfileFragment profileFragment = this;
        profileViewModel.getObservable(GetUserMessage.class).observe(profileFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.setting.ProfileFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ProfileFragment.addSubscription$lambda$2(ProfileFragment.this, (Resource) obj);
            }
        });
        ProfileViewModel profileViewModel3 = this.vm;
        if (profileViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        } else {
            profileViewModel2 = profileViewModel3;
        }
        profileViewModel2.getObservable(UpdateMessage.class).observe(profileFragment, new Observer() { // from class: com.glority.android.picturexx.settings.fragment.setting.ProfileFragment$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ProfileFragment.addSubscription$lambda$3(ProfileFragment.this, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscription$lambda$2(final ProfileFragment this$0, Resource resource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResponseUtil responseUtil = ResponseUtil.INSTANCE;
        Intrinsics.checkNotNull(resource);
        responseUtil.handleResult(resource, new DefaultResponseHandler<GetUserMessage>() { // from class: com.glority.android.picturexx.settings.fragment.setting.ProfileFragment$addSubscription$1$1
            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void success(GetUserMessage data) {
                super.success((ProfileFragment$addSubscription$1$1) data);
                if (data == null) {
                    return;
                }
                LogUtils.d("GetUserMessage Requested Successfully!");
                ProfileFragment.this.initView(data.getUser().getNickname(), data.getUser().getAvatarUrl(), data.getUser().getEmail());
                ProfileFragment.this.hideProgress();
            }

            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void error(Throwable e) {
                super.error(e);
                Object[] objArr = new Object[2];
                objArr[0] = "GetUserMessage Requested Failure!";
                objArr[1] = e != null ? e.getMessage() : null;
                LogUtils.e(objArr);
                ProfileFragment.this.initView(null, null, null);
                ProfileFragment.this.hideProgress();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscription$lambda$3(final ProfileFragment this$0, Resource resource) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ResponseUtil responseUtil = ResponseUtil.INSTANCE;
        Intrinsics.checkNotNull(resource);
        responseUtil.handleResult(resource, new DefaultResponseHandler<UpdateMessage>() { // from class: com.glority.android.picturexx.settings.fragment.setting.ProfileFragment$addSubscription$2$1
            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void success(UpdateMessage data) {
                Boolean bool;
                FragmentActivity activity;
                super.success((ProfileFragment$addSubscription$2$1) data);
                if (data == null) {
                    return;
                }
                ProfileFragment.this.hideProgress();
                LogUtils.d("UpdateMessage Requested Successfully!");
                User value = AppViewModel.INSTANCE.getInstance().getUser().getValue();
                if (value == null) {
                    return;
                }
                String avatarUrl = data.getAvatarUrl();
                if (avatarUrl != null) {
                    value.setAvatarUrl(avatarUrl);
                }
                value.setNickname(ProfileFragment.access$getBinding(ProfileFragment.this).etName.getText().toString());
                AppViewModel.INSTANCE.getInstance().updateUser(value);
                try {
                    bool = Boolean.valueOf(FragmentKt.findNavController(ProfileFragment.this).navigateUp());
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                    bool = null;
                }
                ProfileFragment profileFragment = ProfileFragment.this;
                if (Intrinsics.areEqual((Object) bool, (Object) true) || (activity = profileFragment.getActivity()) == null) {
                    return;
                }
                activity.finish();
            }

            @Override // com.glority.base.utils.data.DefaultResponseHandler, com.glority.base.utils.data.ResponseHandler
            public void error(Throwable e) {
                super.error(e);
                ProfileFragment.this.hideProgress();
                Object[] objArr = new Object[2];
                objArr[0] = "UpdateMessage Requested Failure!";
                objArr[1] = e != null ? e.getMessage() : null;
                LogUtils.e(objArr);
                if (e != null) {
                    e.printStackTrace();
                }
            }
        });
    }

    static /* synthetic */ void updateProfile$default(ProfileFragment profileFragment, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            file = null;
        }
        profileFragment.updateProfile(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateProfile(File image) {
        String obj = ((FragmentProfileBinding) getBinding()).etName.getText().toString();
        if (obj.length() == 0) {
            ToastUtils.showShort(R.string.error_name_is_empty);
            return;
        }
        User value = AppViewModel.INSTANCE.getInstance().getUser().getValue();
        if (!Intrinsics.areEqual(obj, value != null ? value.getNickname() : null)) {
            ProfileViewModel profileViewModel = this.vm;
            if (profileViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                profileViewModel = null;
            }
            profileViewModel.updateProfile(obj, image, null);
            com.glority.android.ui.base.v2.BaseFragment.showProgress$default(this, null, false, 3, null);
            return;
        }
        if (image != null) {
            ProfileViewModel profileViewModel2 = this.vm;
            if (profileViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                profileViewModel2 = null;
            }
            profileViewModel2.updateProfile(obj, image, null);
            com.glority.android.ui.base.v2.BaseFragment.showProgress$default(this, null, false, 3, null);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, SettingsLogEvents.Edit_Profile_Page_Close, null, 2, null);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return Scopes.PROFILE;
    }
}
