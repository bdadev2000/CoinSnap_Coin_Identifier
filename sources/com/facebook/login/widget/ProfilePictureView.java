package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.j;
import com.facebook.AccessToken;
import com.facebook.BuildConfig;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.internal.ImageDownloader;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.ImageResponse;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.R;
import com.google.common.primitives.Ints;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.m;

/* loaded from: classes.dex */
public final class ProfilePictureView extends FrameLayout {

    @NotNull
    private static final String BITMAP_HEIGHT_KEY = "ProfilePictureView_height";

    @NotNull
    private static final String BITMAP_KEY = "ProfilePictureView_bitmap";

    @NotNull
    private static final String BITMAP_WIDTH_KEY = "ProfilePictureView_width";
    public static final int CUSTOM = -1;
    private static final boolean IS_CROPPED_DEFAULT_VALUE = true;

    @NotNull
    private static final String IS_CROPPED_KEY = "ProfilePictureView_isCropped";
    public static final int LARGE = -4;
    private static final int MIN_SIZE = 1;
    public static final int NORMAL = -3;

    @NotNull
    private static final String PENDING_REFRESH_KEY = "ProfilePictureView_refresh";

    @NotNull
    private static final String PRESET_SIZE_KEY = "ProfilePictureView_presetSize";

    @NotNull
    private static final String PROFILE_ID_KEY = "ProfilePictureView_profileId";
    public static final int SMALL = -2;

    @NotNull
    private static final String SUPER_STATE_KEY = "ProfilePictureView_superState";

    @Nullable
    private Bitmap customizedDefaultProfilePicture;

    @NotNull
    private final ImageView image;

    @Nullable
    private Bitmap imageContents;
    private boolean isCropped;

    @Nullable
    private ImageRequest lastRequest;

    @Nullable
    private OnErrorListener onErrorListener;
    private int presetSize;

    @Nullable
    private String profileId;

    @Nullable
    private ProfileTracker profileTracker;
    private int queryHeight;
    private int queryWidth;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "ProfilePictureView";

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final String getTAG() {
            return ProfilePictureView.TAG;
        }
    }

    /* loaded from: classes.dex */
    public interface OnErrorListener {
        void onError(@NotNull FacebookException facebookException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(@NotNull Context context) {
        super(context);
        p0.a.s(context, "context");
        this.image = new ImageView(getContext());
        this.isCropped = true;
        this.presetSize = -1;
        initialize();
    }

    public static /* synthetic */ void a(ProfilePictureView profilePictureView, ImageResponse imageResponse) {
        m579sendImageRequest$lambda2(profilePictureView, imageResponse);
    }

    private final int getPresetSizeInPixels(boolean z2) {
        int i2;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            int i3 = this.presetSize;
            if (i3 == -1 && !z2) {
                return 0;
            }
            if (i3 == -4) {
                i2 = R.dimen.com_facebook_profilepictureview_preset_size_large;
            } else if (i3 == -3) {
                i2 = R.dimen.com_facebook_profilepictureview_preset_size_normal;
            } else if (i3 == -2) {
                i2 = R.dimen.com_facebook_profilepictureview_preset_size_small;
            } else {
                if (i3 != -1) {
                    return 0;
                }
                i2 = R.dimen.com_facebook_profilepictureview_preset_size_normal;
            }
            return getResources().getDimensionPixelSize(i2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    private final Uri getProfilePictureUri(String str) {
        Profile currentProfile = Profile.Companion.getCurrentProfile();
        return (currentProfile == null || !AccessToken.Companion.isLoggedInWithInstagram()) ? ImageRequest.Companion.getProfilePictureUri(this.profileId, this.queryWidth, this.queryHeight, str) : currentProfile.getProfilePictureUri(this.queryWidth, this.queryHeight);
    }

    private final void initialize() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            removeAllViews();
            this.image.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.image.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.image);
            this.profileTracker = new ProfileTracker() { // from class: com.facebook.login.widget.ProfilePictureView$initialize$1
                @Override // com.facebook.ProfileTracker
                public void onCurrentProfileChanged(@Nullable Profile profile, @Nullable Profile profile2) {
                    ProfilePictureView.this.setProfileId(profile2 == null ? null : profile2.getId());
                    ProfilePictureView.this.refreshImage(true);
                }
            };
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final boolean isUnspecifiedDimensions() {
        return this.queryWidth == 0 && this.queryHeight == 0;
    }

    private final void parseAttributes(AttributeSet attributeSet) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.com_facebook_profile_picture_view);
            p0.a.r(obtainStyledAttributes, "context.obtainStyledAttributes(attrs, R.styleable.com_facebook_profile_picture_view)");
            setPresetSize(obtainStyledAttributes.getInt(R.styleable.com_facebook_profile_picture_view_com_facebook_preset_size, -1));
            setCropped(obtainStyledAttributes.getBoolean(R.styleable.com_facebook_profile_picture_view_com_facebook_is_cropped, true));
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void processResponse(ImageResponse imageResponse) {
        if (CrashShieldHandler.isObjectCrashing(this) || imageResponse == null) {
            return;
        }
        try {
            if (p0.a.g(imageResponse.getRequest(), this.lastRequest)) {
                this.lastRequest = null;
                Bitmap bitmap = imageResponse.getBitmap();
                Exception error = imageResponse.getError();
                if (error != null) {
                    OnErrorListener onErrorListener = this.onErrorListener;
                    if (onErrorListener != null) {
                        onErrorListener.onError(new FacebookException(p0.a.z0(this.profileId, "Error in downloading profile picture for profileId: "), error));
                        return;
                    } else {
                        Logger.Companion.log(LoggingBehavior.REQUESTS, 6, TAG, error.toString());
                        return;
                    }
                }
                if (bitmap == null) {
                    return;
                }
                setImageBitmap(bitmap);
                if (imageResponse.isCachedRedirect()) {
                    sendImageRequest(false);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void refreshImage(boolean z2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            boolean updateImageQueryParameters = updateImageQueryParameters();
            String str = this.profileId;
            if (str != null && str.length() != 0 && !isUnspecifiedDimensions()) {
                if (updateImageQueryParameters || z2) {
                    sendImageRequest(true);
                    return;
                }
                return;
            }
            setBlankProfilePicture();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void sendImageRequest(boolean z2) {
        AccessToken currentAccessToken;
        String token;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            AccessToken.Companion companion = AccessToken.Companion;
            String str = "";
            if (companion.isCurrentAccessTokenActive() && (currentAccessToken = companion.getCurrentAccessToken()) != null && (token = currentAccessToken.getToken()) != null) {
                str = token;
            }
            Uri profilePictureUri = getProfilePictureUri(str);
            Context context = getContext();
            p0.a.r(context, "context");
            ImageRequest build = new ImageRequest.Builder(context, profilePictureUri).setAllowCachedRedirects(z2).setCallerTag(this).setCallback(new j(this, 7)).build();
            ImageRequest imageRequest = this.lastRequest;
            if (imageRequest != null) {
                ImageDownloader.cancelRequest(imageRequest);
            }
            this.lastRequest = build;
            ImageDownloader.downloadAsync(build);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* renamed from: sendImageRequest$lambda-2 */
    public static final void m579sendImageRequest$lambda2(ProfilePictureView profilePictureView, ImageResponse imageResponse) {
        p0.a.s(profilePictureView, "this$0");
        profilePictureView.processResponse(imageResponse);
    }

    private final void setBlankProfilePicture() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            ImageRequest imageRequest = this.lastRequest;
            if (imageRequest != null) {
                ImageDownloader.cancelRequest(imageRequest);
            }
            Bitmap bitmap = this.customizedDefaultProfilePicture;
            if (bitmap == null) {
                setImageBitmap(BitmapFactory.decodeResource(getResources(), this.isCropped ? R.drawable.com_facebook_profile_picture_blank_square : R.drawable.com_facebook_profile_picture_blank_portrait));
            } else {
                updateImageQueryParameters();
                setImageBitmap(Bitmap.createScaledBitmap(bitmap, this.queryWidth, this.queryHeight, false));
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void setImageBitmap(Bitmap bitmap) {
        if (CrashShieldHandler.isObjectCrashing(this) || bitmap == null) {
            return;
        }
        try {
            this.imageContents = bitmap;
            this.image.setImageBitmap(bitmap);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final boolean updateImageQueryParameters() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            int height = getHeight();
            int width = getWidth();
            boolean z2 = true;
            if (width >= 1 && height >= 1) {
                int presetSizeInPixels = getPresetSizeInPixels(false);
                if (presetSizeInPixels != 0) {
                    height = presetSizeInPixels;
                    width = height;
                }
                if (width <= height) {
                    height = this.isCropped ? width : 0;
                } else {
                    width = this.isCropped ? height : 0;
                }
                if (width == this.queryWidth && height == this.queryHeight) {
                    z2 = false;
                }
                this.queryWidth = width;
                this.queryHeight = height;
                return z2;
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(BuildConfig.LIBRARY_PACKAGE_NAME, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public final OnErrorListener getOnErrorListener() {
        return this.onErrorListener;
    }

    public final int getPresetSize() {
        return this.presetSize;
    }

    @Nullable
    public final String getProfileId() {
        return this.profileId;
    }

    public final boolean getShouldUpdateOnProfileChange() {
        ProfileTracker profileTracker = this.profileTracker;
        if (profileTracker == null) {
            return false;
        }
        return profileTracker.isTracking();
    }

    public final boolean isCropped() {
        return this.isCropped;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lastRequest = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        refreshImage(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        boolean z2;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z3 = true;
        if (View.MeasureSpec.getMode(i3) == 1073741824 || layoutParams.height != -2) {
            z2 = false;
        } else {
            size = getPresetSizeInPixels(true);
            i3 = View.MeasureSpec.makeMeasureSpec(size, Ints.MAX_POWER_OF_TWO);
            z2 = true;
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824 || layoutParams.width != -2) {
            z3 = z2;
        } else {
            size2 = getPresetSizeInPixels(true);
            i2 = View.MeasureSpec.makeMeasureSpec(size2, Ints.MAX_POWER_OF_TWO);
        }
        if (!z3) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(size2, size);
            measureChildren(i2, i3);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable parcelable) {
        p0.a.s(parcelable, "state");
        if (!p0.a.g(parcelable.getClass(), Bundle.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable(SUPER_STATE_KEY));
        setProfileId(bundle.getString(PROFILE_ID_KEY));
        setPresetSize(bundle.getInt(PRESET_SIZE_KEY));
        setCropped(bundle.getBoolean(IS_CROPPED_KEY));
        this.queryWidth = bundle.getInt(BITMAP_WIDTH_KEY);
        this.queryHeight = bundle.getInt(BITMAP_HEIGHT_KEY);
        refreshImage(true);
    }

    @Override // android.view.View
    @NotNull
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable(SUPER_STATE_KEY, onSaveInstanceState);
        bundle.putString(PROFILE_ID_KEY, this.profileId);
        bundle.putInt(PRESET_SIZE_KEY, this.presetSize);
        bundle.putBoolean(IS_CROPPED_KEY, this.isCropped);
        bundle.putInt(BITMAP_WIDTH_KEY, this.queryWidth);
        bundle.putInt(BITMAP_HEIGHT_KEY, this.queryHeight);
        bundle.putBoolean(PENDING_REFRESH_KEY, this.lastRequest != null);
        return bundle;
    }

    public final void setCropped(boolean z2) {
        this.isCropped = z2;
        refreshImage(false);
    }

    public final void setDefaultProfilePicture(@Nullable Bitmap bitmap) {
        this.customizedDefaultProfilePicture = bitmap;
    }

    public final void setOnErrorListener(@Nullable OnErrorListener onErrorListener) {
        this.onErrorListener = onErrorListener;
    }

    public final void setPresetSize(int i2) {
        if (i2 != -4 && i2 != -3 && i2 != -2 && i2 != -1) {
            throw new IllegalArgumentException("Must use a predefined preset size");
        }
        this.presetSize = i2;
        requestLayout();
    }

    public final void setProfileId(@Nullable String str) {
        String str2 = this.profileId;
        boolean z2 = true;
        if (str2 == null || str2.length() == 0 || !m.S0(this.profileId, str, true)) {
            setBlankProfilePicture();
        } else {
            z2 = false;
        }
        this.profileId = str;
        refreshImage(z2);
    }

    public final void setShouldUpdateOnProfileChange(boolean z2) {
        if (z2) {
            ProfileTracker profileTracker = this.profileTracker;
            if (profileTracker == null) {
                return;
            }
            profileTracker.startTracking();
            return;
        }
        ProfileTracker profileTracker2 = this.profileTracker;
        if (profileTracker2 == null) {
            return;
        }
        profileTracker2.stopTracking();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        p0.a.s(context, "context");
        p0.a.s(attributeSet, "attrs");
        this.image = new ImageView(getContext());
        this.isCropped = true;
        this.presetSize = -1;
        initialize();
        parseAttributes(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        p0.a.s(context, "context");
        p0.a.s(attributeSet, "attrs");
        this.image = new ImageView(getContext());
        this.isCropped = true;
        this.presetSize = -1;
        initialize();
        parseAttributes(attributeSet);
    }
}
