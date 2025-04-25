package com.glority.imagepicker;

import android.app.Dialog;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.CursorLoader;
import androidx.loader.content.Loader;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import com.glority.imagepicker.adapter.FolderAdapter;
import com.glority.imagepicker.adapter.ImageGridAdapter;
import com.glority.imagepicker.bean.Folder;
import com.glority.imagepicker.bean.Image;
import com.glority.imagepicker.bean.ResultImage;
import com.glority.imagepicker.utils.FileUtils;
import com.glority.imagepicker.utils.ScreenUtils;
import com.glority.utils.ui.ToastUtils;
import com.glority.widget.GlProgressDialog;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class MultiImageSelectorFragment extends Fragment {
    private static final int COLUMN_NUM = 3;
    public static final String EXTRA_DEFAULT_SELECTED_LIST = "default_list";
    public static final String EXTRA_SELECT_COUNT = "max_select_count";
    public static final String EXTRA_SELECT_MODE = "select_count_mode";
    public static final String EXTRA_SHOW_CAMERA = "show_camera";
    public static final String[] IMAGE_PROJECTION = {"_data", "_display_name", "date_added", "mime_type", "_size", TransferTable.COLUMN_ID};
    private static final String KEY_TEMP_FILE = "key_temp_file";
    private static final int LOADER_ALL = 0;
    private static final int LOADER_CATEGORY = 1;
    public static final int MODE_MULTI = 1;
    public static final int MODE_SINGLE = 0;
    private static final int REQUEST_CAMERA = 100;
    private static final int REQUEST_CAMERA_PERMISSION = 120;
    private static final int REQUEST_STORAGE_WRITE_ACCESS_PERMISSION = 110;
    public static final String TAG = "MultiImageSelectorFragment";
    private Uri captureUri;
    private Dialog glProgressDialog;
    List<Image> images;
    private Callback mCallback;
    private TextView mCategoryText;
    private FolderAdapter mFolderAdapter;
    private ListPopupWindow mFolderPopupWindow;
    private GridView mGridView;
    private ImageGridAdapter mImageAdapter;
    private View mPopupAnchorView;
    private boolean isCameraBack = false;
    private ArrayList<Uri> resultList = new ArrayList<>();
    private ArrayList<Folder> mResultFolder = new ArrayList<>();
    private ArrayList<Uri> cameraUris = new ArrayList<>();
    private boolean hasFolderGened = false;
    private AtomicBoolean isLoading = new AtomicBoolean(false);
    private LoaderManager.LoaderCallbacks<Cursor> mLoaderCallback = new AnonymousClass7();

    /* loaded from: classes6.dex */
    public interface Callback {
        void onImageSelected(Uri uri, PhotoFrom photoFrom);

        void onImageUnselected(Uri uri);

        void onSingleImageSelected(Uri uri, PhotoFrom photoFrom);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.mCallback = (Callback) getActivity();
        } catch (ClassCastException unused) {
            throw new ClassCastException("The Activity must implement MultiImageSelectorFragment.Callback interface...");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.mis_fragment_multi_image, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ArrayList parcelableArrayList;
        super.onViewCreated(view, bundle);
        this.glProgressDialog = GlProgressDialog.INSTANCE.show(view.getContext(), false, (String) null);
        final int selectMode = selectMode();
        if (selectMode == 1 && (parcelableArrayList = getArguments().getParcelableArrayList("default_list")) != null && parcelableArrayList.size() > 0) {
            this.resultList.clear();
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                ResultImage resultImage = (ResultImage) it.next();
                this.resultList.add(resultImage.imageUri);
                if (resultImage.photoFrom == PhotoFrom.BACK_CAMERA || resultImage.photoFrom == PhotoFrom.FRONT_CAMERA) {
                    this.cameraUris.add(resultImage.imageUri);
                }
            }
        }
        ImageGridAdapter imageGridAdapter = new ImageGridAdapter(getActivity(), showCamera(), 3);
        this.mImageAdapter = imageGridAdapter;
        imageGridAdapter.showSelectIndicator(selectMode == 1);
        this.mPopupAnchorView = view.findViewById(R.id.footer);
        TextView textView = (TextView) view.findViewById(R.id.category_btn);
        this.mCategoryText = textView;
        textView.setText(R.string.mis_folder_all);
        this.mCategoryText.setOnClickListener(new View.OnClickListener() { // from class: com.glority.imagepicker.MultiImageSelectorFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (MultiImageSelectorFragment.this.mFolderPopupWindow == null) {
                    MultiImageSelectorFragment.this.createPopupFolderList();
                }
                if (MultiImageSelectorFragment.this.mFolderPopupWindow.isShowing()) {
                    MultiImageSelectorFragment.this.mFolderPopupWindow.dismiss();
                    return;
                }
                MultiImageSelectorFragment.this.mFolderPopupWindow.show();
                int selectIndex = MultiImageSelectorFragment.this.mFolderAdapter.getSelectIndex();
                if (selectIndex != 0) {
                    selectIndex--;
                }
                MultiImageSelectorFragment.this.mFolderPopupWindow.getListView().setSelection(selectIndex);
            }
        });
        GridView gridView = (GridView) view.findViewById(R.id.grid);
        this.mGridView = gridView;
        gridView.setAdapter((ListAdapter) this.mImageAdapter);
        this.mGridView.setNumColumns(3);
        this.mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.glority.imagepicker.MultiImageSelectorFragment.2
            /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.Adapter] */
            /* JADX WARN: Type inference failed for: r1v4, types: [android.widget.Adapter] */
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view2, int i, long j) {
                if (!MultiImageSelectorFragment.this.mImageAdapter.isShowCamera()) {
                    MultiImageSelectorFragment.this.selectImageFromGrid((Image) adapterView.getAdapter().getItem(i), selectMode);
                } else if (i == 0) {
                    MultiImageSelectorFragment.this.showCameraAction();
                } else {
                    MultiImageSelectorFragment.this.selectImageFromGrid((Image) adapterView.getAdapter().getItem(i), selectMode);
                }
            }
        });
        this.mGridView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.glority.imagepicker.MultiImageSelectorFragment.3
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
            }
        });
        this.mFolderAdapter = new FolderAdapter(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createPopupFolderList() {
        int i = ScreenUtils.getScreenSize(getActivity()).x;
        ListPopupWindow listPopupWindow = new ListPopupWindow(getActivity());
        this.mFolderPopupWindow = listPopupWindow;
        listPopupWindow.setBackgroundDrawable(new ColorDrawable(-1));
        this.mFolderPopupWindow.setAdapter(this.mFolderAdapter);
        this.mFolderPopupWindow.setContentWidth(i);
        this.mFolderPopupWindow.setWidth(i);
        this.mFolderPopupWindow.setHeight((int) (r0.y * 0.5625f));
        this.mFolderPopupWindow.setAnchorView(this.mPopupAnchorView);
        this.mFolderPopupWindow.setModal(true);
        this.mFolderPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.glority.imagepicker.MultiImageSelectorFragment.4
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(final AdapterView<?> adapterView, View view, final int i2, long j) {
                MultiImageSelectorFragment.this.mFolderAdapter.setSelectIndex(i2);
                new Handler().postDelayed(new Runnable() { // from class: com.glority.imagepicker.MultiImageSelectorFragment.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiImageSelectorFragment.this.mFolderPopupWindow.dismiss();
                        if (i2 == 0) {
                            MultiImageSelectorFragment.this.getActivity().getSupportLoaderManager().restartLoader(0, null, MultiImageSelectorFragment.this.mLoaderCallback);
                            MultiImageSelectorFragment.this.mCategoryText.setText(R.string.mis_folder_all);
                            if (MultiImageSelectorFragment.this.showCamera()) {
                                MultiImageSelectorFragment.this.mImageAdapter.setShowCamera(true);
                            } else {
                                MultiImageSelectorFragment.this.mImageAdapter.setShowCamera(false);
                            }
                        } else {
                            Folder folder = (Folder) adapterView.getAdapter().getItem(i2);
                            if (folder != null) {
                                Log.e("Fragment", "setData1");
                                Collections.sort(folder.images, new FileComparator());
                                MultiImageSelectorFragment.this.mImageAdapter.setData(folder.images);
                                MultiImageSelectorFragment.this.mCategoryText.setText(folder.name);
                                if (MultiImageSelectorFragment.this.resultList != null && MultiImageSelectorFragment.this.resultList.size() > 0) {
                                    MultiImageSelectorFragment.this.mImageAdapter.setDefaultSelected(MultiImageSelectorFragment.this.resultList);
                                }
                            }
                            MultiImageSelectorFragment.this.mImageAdapter.setShowCamera(false);
                        }
                        MultiImageSelectorFragment.this.mGridView.smoothScrollToPosition(0);
                    }
                }, 100L);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(KEY_TEMP_FILE, this.captureUri);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.captureUri = (Uri) bundle.getParcelable(KEY_TEMP_FILE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getActivity().getSupportLoaderManager().initLoader(0, null, this.mLoaderCallback);
    }

    @Override // androidx.fragment.app.Fragment, com.glority.base.presenter.IResultManager
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (i2 == -1) {
                if (this.captureUri != null) {
                    this.isCameraBack = true;
                    Cursor query = getContext().getContentResolver().query(this.captureUri, null, null, null, null);
                    if (query.getCount() > 0) {
                        query.moveToFirst();
                        String[] strArr = IMAGE_PROJECTION;
                        String string = query.getString(query.getColumnIndexOrThrow(strArr[0]));
                        Image image = new Image(string, query.getString(query.getColumnIndexOrThrow(strArr[1])), query.getLong(query.getColumnIndexOrThrow(strArr[2])), this.captureUri);
                        this.cameraUris.add(this.captureUri);
                        Log.e("ImageName", image.name);
                        this.mImageAdapter.addShotImage(image);
                        selectImageFromGrid(image, selectMode());
                        refreshMediaStore(string);
                        return;
                    }
                    getContext().getContentResolver().delete(this.captureUri, null, null);
                    this.captureUri = null;
                    return;
                }
                return;
            }
            if (this.captureUri != null) {
                getContext().getContentResolver().delete(this.captureUri, null, null);
                this.captureUri = null;
            }
        }
    }

    private void refreshMediaStore(String str) {
        if (Build.VERSION.SDK_INT < 29) {
            MediaScannerConnection.scanFile(getContext(), new String[]{str}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.glority.imagepicker.MultiImageSelectorFragment.5
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public void onScanCompleted(String str2, Uri uri) {
                    Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                    intent.setData(uri);
                    MultiImageSelectorFragment.this.getActivity().sendBroadcast(intent);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        ListPopupWindow listPopupWindow = this.mFolderPopupWindow;
        if (listPopupWindow != null && listPopupWindow.isShowing()) {
            this.mFolderPopupWindow.dismiss();
        }
        super.onConfigurationChanged(configuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCameraAction() {
        String[] strArr = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            if (ContextCompat.checkSelfPermission(getContext(), str) != 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() > 0) {
            requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), REQUEST_STORAGE_WRITE_ACCESS_PERMISSION);
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            Uri createEmptyUri = FileUtils.createEmptyUri(getActivity());
            this.captureUri = createEmptyUri;
            if (createEmptyUri != null) {
                intent.putExtra("output", createEmptyUri);
                intent.addFlags(1);
                startActivityForResult(intent, 100);
                return;
            }
            ToastUtils.showError(R.string.mis_error_image_not_exist, new Object[0]);
            return;
        }
        ToastUtils.showError(R.string.mis_msg_no_camera, new Object[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != REQUEST_STORAGE_WRITE_ACCESS_PERMISSION || iArr.length <= 0) {
            return;
        }
        if (iArr[0] == 0) {
            showCameraAction();
        } else if (!shouldShowRequestPermissionRationale(strArr[0])) {
            showPermissionSettingDialog();
        } else {
            ToastUtils.showNotice(R.string.mis_text_permission_denied_try_after, new Object[0]);
        }
    }

    private void showPermissionSettingDialog() {
        new AlertDialog.Builder(getContext()).setTitle(R.string.mis_permission_dialog_title).setMessage(R.string.mis_text_set_camera_permission_in_settings).setPositiveButton(R.string.mis_permission_dialog_to_set, new DialogInterface.OnClickListener() { // from class: com.glority.imagepicker.MultiImageSelectorFragment.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", MultiImageSelectorFragment.this.getContext().getPackageName(), null));
                MultiImageSelectorFragment.this.startActivity(intent);
                dialogInterface.dismiss();
            }
        }).setNegativeButton(R.string.mis_permission_dialog_cancel, (DialogInterface.OnClickListener) null).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selectImageFromGrid(Image image, int i) {
        if (image != null) {
            if (i == 1) {
                if (this.resultList.contains(image.uri)) {
                    this.resultList.remove(image.uri);
                    Callback callback = this.mCallback;
                    if (callback != null) {
                        callback.onImageUnselected(image.uri);
                    }
                } else if (selectImageCount() == this.resultList.size()) {
                    ToastUtils.showShort(getActivity().getResources().getString(R.string.mis_msg_amount_limit, String.valueOf(selectImageCount())));
                    return;
                } else {
                    this.resultList.add(image.uri);
                    if (this.mCallback != null) {
                        this.mCallback.onImageSelected(image.uri, this.cameraUris.contains(image.uri) ? PhotoFrom.BACK_CAMERA : PhotoFrom.ALBUM);
                    }
                }
                this.mImageAdapter.select(image);
                return;
            }
            if (i != 0 || this.mCallback == null) {
                return;
            }
            this.mCallback.onSingleImageSelected(image.uri, this.cameraUris.contains(image.uri) ? PhotoFrom.BACK_CAMERA : PhotoFrom.ALBUM);
        }
    }

    /* renamed from: com.glority.imagepicker.MultiImageSelectorFragment$7, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass7 implements LoaderManager.LoaderCallbacks<Cursor> {
        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public void onLoaderReset(Loader<Cursor> loader) {
        }

        AnonymousClass7() {
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
            Log.e("Fragment", "onCreateLoader");
            if (i == 0) {
                return new CursorLoader(MultiImageSelectorFragment.this.getActivity(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MultiImageSelectorFragment.IMAGE_PROJECTION, MultiImageSelectorFragment.IMAGE_PROJECTION[4] + ">0 AND " + MultiImageSelectorFragment.IMAGE_PROJECTION[3] + "=? OR " + MultiImageSelectorFragment.IMAGE_PROJECTION[3] + "=? OR " + MultiImageSelectorFragment.IMAGE_PROJECTION[3] + "=? OR " + MultiImageSelectorFragment.IMAGE_PROJECTION[3] + "=? ", new String[]{MimeTypes.IMAGE_JPEG, "image/png", "image/webp", "image/heic"}, MultiImageSelectorFragment.IMAGE_PROJECTION[2] + " DESC");
            }
            if (i == 1) {
                return new CursorLoader(MultiImageSelectorFragment.this.getActivity(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MultiImageSelectorFragment.IMAGE_PROJECTION, MultiImageSelectorFragment.IMAGE_PROJECTION[4] + ">0 AND " + MultiImageSelectorFragment.IMAGE_PROJECTION[0] + " like '%" + bundle.getString("path") + "%'", null, MultiImageSelectorFragment.IMAGE_PROJECTION[2] + " DESC");
            }
            return null;
        }

        private boolean fileExist(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return new File(str).exists();
        }

        @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
        public void onLoadFinished(Loader<Cursor> loader, final Cursor cursor) {
            Log.e("Fragment", "onLoadFinished " + Thread.currentThread().getName());
            if (MultiImageSelectorFragment.this.isCameraBack) {
                MultiImageSelectorFragment.this.isCameraBack = false;
            } else {
                if (MultiImageSelectorFragment.this.isLoading.get()) {
                    return;
                }
                new Thread(new Runnable() { // from class: com.glority.imagepicker.MultiImageSelectorFragment.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Image image;
                        File parentFile;
                        MultiImageSelectorFragment.this.isLoading.set(true);
                        Cursor cursor2 = cursor;
                        if (cursor2 != null && !cursor2.isClosed()) {
                            try {
                                if (cursor.getCount() > 0) {
                                    MultiImageSelectorFragment.this.images = Collections.synchronizedList(new ArrayList());
                                    cursor.moveToFirst();
                                    Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                                    do {
                                        Cursor cursor3 = cursor;
                                        String string = cursor3.getString(cursor3.getColumnIndexOrThrow(MultiImageSelectorFragment.IMAGE_PROJECTION[0]));
                                        Cursor cursor4 = cursor;
                                        String string2 = cursor4.getString(cursor4.getColumnIndexOrThrow(MultiImageSelectorFragment.IMAGE_PROJECTION[1]));
                                        Cursor cursor5 = cursor;
                                        long j = cursor5.getLong(cursor5.getColumnIndexOrThrow(MultiImageSelectorFragment.IMAGE_PROJECTION[2]));
                                        Cursor cursor6 = cursor;
                                        long j2 = cursor6.getLong(cursor6.getColumnIndexOrThrow(MultiImageSelectorFragment.IMAGE_PROJECTION[5]));
                                        if (TextUtils.isEmpty(string2)) {
                                            image = null;
                                        } else {
                                            image = new Image(string, string2, j, ContentUris.withAppendedId(uri, j2));
                                            MultiImageSelectorFragment.this.images.add(image);
                                        }
                                        if (!MultiImageSelectorFragment.this.hasFolderGened && (parentFile = new File(string).getParentFile()) != null && parentFile.exists()) {
                                            String absolutePath = parentFile.getAbsolutePath();
                                            Folder folderByPath = MultiImageSelectorFragment.this.getFolderByPath(absolutePath);
                                            if (folderByPath == null) {
                                                Folder folder = new Folder();
                                                folder.name = parentFile.getName();
                                                folder.path = absolutePath;
                                                folder.cover = image;
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(image);
                                                folder.images = arrayList;
                                                MultiImageSelectorFragment.this.mResultFolder.add(folder);
                                            } else {
                                                folderByPath.images.add(image);
                                            }
                                        }
                                        if (cursor.isClosed()) {
                                            break;
                                        }
                                    } while (cursor.moveToNext());
                                    Log.e("Fragment", "sort");
                                    Collections.sort(MultiImageSelectorFragment.this.images, new FileComparator());
                                    Log.e("Fragment", "setData2");
                                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.glority.imagepicker.MultiImageSelectorFragment.7.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            if (MultiImageSelectorFragment.this.getActivity() == null || MultiImageSelectorFragment.this.getActivity().isFinishing()) {
                                                return;
                                            }
                                            MultiImageSelectorFragment.this.glProgressDialog.dismiss();
                                            MultiImageSelectorFragment.this.mImageAdapter.setData(MultiImageSelectorFragment.this.images);
                                            if (MultiImageSelectorFragment.this.resultList != null && MultiImageSelectorFragment.this.resultList.size() > 0) {
                                                MultiImageSelectorFragment.this.mImageAdapter.setDefaultSelected(MultiImageSelectorFragment.this.resultList);
                                            }
                                            if (MultiImageSelectorFragment.this.hasFolderGened) {
                                                return;
                                            }
                                            MultiImageSelectorFragment.this.mFolderAdapter.setData(MultiImageSelectorFragment.this.mResultFolder);
                                            MultiImageSelectorFragment.this.hasFolderGened = true;
                                        }
                                    });
                                } else {
                                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.glority.imagepicker.MultiImageSelectorFragment.7.1.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            if (MultiImageSelectorFragment.this.getActivity() == null || MultiImageSelectorFragment.this.getActivity().isFinishing()) {
                                                return;
                                            }
                                            MultiImageSelectorFragment.this.glProgressDialog.dismiss();
                                        }
                                    });
                                }
                                cursor.close();
                            } catch (Throwable th) {
                                try {
                                    cursor.close();
                                } catch (Throwable th2) {
                                    Log.e("Fragment", "onLoadFinished " + th2.getMessage());
                                }
                                Log.e("Fragment", "onLoadFinished " + th.getMessage());
                            }
                        }
                        MultiImageSelectorFragment.this.isLoading.set(false);
                    }
                }).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Folder getFolderByPath(String str) {
        ArrayList<Folder> arrayList = this.mResultFolder;
        if (arrayList == null) {
            return null;
        }
        Iterator<Folder> it = arrayList.iterator();
        while (it.hasNext()) {
            Folder next = it.next();
            if (TextUtils.equals(next.path, str)) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean showCamera() {
        return getArguments() == null || getArguments().getBoolean("show_camera", true);
    }

    private int selectMode() {
        if (getArguments() == null) {
            return 1;
        }
        return getArguments().getInt("select_count_mode");
    }

    private int selectImageCount() {
        if (getArguments() == null) {
            return 9;
        }
        return getArguments().getInt("max_select_count");
    }
}
