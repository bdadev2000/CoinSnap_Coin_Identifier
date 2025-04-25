package com.glority.base.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.glority.android.core.app.AppContext;
import com.glority.android.ui.base.ContainerActivity;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.base.R;
import com.glority.base.databinding.FragmentImageViewerBinding;
import com.glority.base.fragment.CommonFragment;
import com.glority.imagezoomview.imagezoom.ImageViewTouch;
import com.glority.imagezoomview.imagezoom.ImageViewTouchBase;
import com.glority.utils.app.ResUtils;
import com.glority.utils.permission.Permission;
import com.glority.utils.permission.PermissionUtils;
import com.glority.utils.permission.callback.OnGetPermissionCallback;
import com.glority.utils.store.SandboxUtils;
import com.glority.utils.ui.ToastUtils;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class ImageViewerFragment extends CommonFragment<FragmentImageViewerBinding> {
    private static final String ARG_KEY_IMAGE_INDEX = "arg_key_image_index";
    private static final String ARG_KEY_IMAGE_URLS = "arg_key_image_urls";
    private int currentIndex;
    private ArrayList<Object> imageUrls;

    public static void open(Context context, ArrayList<Object> arrayList) {
        open(context, arrayList, 0);
    }

    public static void open(Context context, ArrayList<Object> arrayList, int i) {
        ContainerActivity.INSTANCE.open(ImageViewerFragment.class).put(ARG_KEY_IMAGE_URLS, arrayList).put(ARG_KEY_IMAGE_INDEX, i).launch(context);
    }

    @Override // com.glority.base.fragment.CommonFragment
    protected int getLayoutId() {
        return R.layout.fragment_image_viewer;
    }

    @Override // com.glority.base.fragment.CommonFragment
    protected void doCreateView(Bundle bundle) {
        this.imageUrls = (ArrayList) getArguments().getSerializable(ARG_KEY_IMAGE_URLS);
        this.currentIndex = getArguments().getInt(ARG_KEY_IMAGE_INDEX);
        if (this.imageUrls == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        for (final int i = 0; i < this.imageUrls.size(); i++) {
            NPImageViewTouch nPImageViewTouch = new NPImageViewTouch(getActivity(), null);
            nPImageViewTouch.setDisplayType(ImageViewTouchBase.DisplayType.FIT_TO_SCREEN);
            Glide.with(this).load(this.imageUrls.get(i)).placeholder(R.drawable.common_background_card).error(R.drawable.common_background_card).thumbnail(0.1f).into(nPImageViewTouch);
            nPImageViewTouch.setSingleTapListener(new ImageViewTouch.OnImageViewTouchSingleTapListener() { // from class: com.glority.base.widget.ImageViewerFragment$$ExternalSyntheticLambda0
                @Override // com.glority.imagezoomview.imagezoom.ImageViewTouch.OnImageViewTouchSingleTapListener
                public final void onSingleTapConfirmed() {
                    ImageViewerFragment.this.lambda$doCreateView$0();
                }
            });
            nPImageViewTouch.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.glority.base.widget.ImageViewerFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean lambda$doCreateView$2;
                    lambda$doCreateView$2 = ImageViewerFragment.this.lambda$doCreateView$2(i, view);
                    return lambda$doCreateView$2;
                }
            });
            arrayList.add(nPImageViewTouch);
        }
        getBinding().viewPager.setZoomBackToOriginalScale(true);
        getBinding().viewPager.setOffscreenPageLimit(3);
        getBinding().viewPager.setPageTransformer(true, new BaseZoomOutTransformer());
        getBinding().viewPager.setAdapter(new BannerAdapter() { // from class: com.glority.base.widget.ImageViewerFragment.2
            @Override // com.glority.base.widget.BannerAdapter
            public View getView(LayoutInflater layoutInflater, int i2) {
                return (View) arrayList.get(i2);
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return arrayList.size();
            }
        });
        getBinding().viewPager.setCurrentItem(this.currentIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doCreateView$0() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$doCreateView$2(final int i, View view) {
        new AlertDialog.Builder(view.getContext()).setItems(new String[]{ResUtils.getString(R.string.text_save)}, new DialogInterface.OnClickListener() { // from class: com.glority.base.widget.ImageViewerFragment$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ImageViewerFragment.this.lambda$doCreateView$1(i, dialogInterface, i2);
            }
        }).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doCreateView$1(int i, DialogInterface dialogInterface, int i2) {
        Glide.with(this).asBitmap().load(this.imageUrls.get(i)).into((RequestBuilder<Bitmap>) new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.glority.base.widget.ImageViewerFragment$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass1 extends SimpleTarget<Bitmap> {
        AnonymousClass1() {
        }

        @Override // com.bumptech.glide.request.target.Target
        public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
            onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
        }

        public void onResourceReady(final Bitmap bitmap, Transition<? super Bitmap> transition) {
            if (Build.VERSION.SDK_INT >= 29) {
                ToastUtils.showShort(SandboxUtils.saveImage(bitmap, AppContext.INSTANCE.getConfig("appName")) != null ? R.string.save_album_text_saved : R.string.text_failed);
            } else {
                PermissionUtils.checkPermission((RuntimePermissionActivity) ImageViewerFragment.this.getActivity(), Permission.STORAGE, new OnGetPermissionCallback() { // from class: com.glority.base.widget.ImageViewerFragment$1$$ExternalSyntheticLambda0
                    @Override // com.glority.utils.permission.callback.OnGetPermissionCallback
                    public final void onGetPermission() {
                        Bitmap bitmap2 = bitmap;
                        ToastUtils.showShort(SandboxUtils.saveImage(r2, AppContext.INSTANCE.getConfig("appName")) != null ? R.string.save_album_text_saved : R.string.text_failed);
                    }
                });
            }
        }
    }

    @Override // com.glority.base.fragment.CommonFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return "";
    }
}
