package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookContentProvider;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareInternalUtility;
import e0.e0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.m;

/* loaded from: classes3.dex */
public final class NativeAppCallAttachmentStore {

    @NotNull
    public static final String ATTACHMENTS_DIR_NAME = "com.facebook.NativeAppCallAttachmentStore.files";

    @NotNull
    public static final NativeAppCallAttachmentStore INSTANCE = new NativeAppCallAttachmentStore();
    private static final String TAG = NativeAppCallAttachmentStore.class.getName();

    @Nullable
    private static File attachmentsDirectory;

    /* loaded from: classes3.dex */
    public static final class Attachment {

        @Nullable
        private final String attachmentName;

        @NotNull
        private final String attachmentUrl;

        @Nullable
        private final Bitmap bitmap;

        @NotNull
        private final UUID callId;
        private boolean isContentUri;

        @Nullable
        private final Uri originalUri;
        private boolean shouldCreateFile;

        public Attachment(@NotNull UUID uuid, @Nullable Bitmap bitmap, @Nullable Uri uri) {
            p0.a.s(uuid, "callId");
            this.callId = uuid;
            this.bitmap = bitmap;
            this.originalUri = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (m.S0("content", scheme, true)) {
                    this.isContentUri = true;
                    String authority = uri.getAuthority();
                    this.shouldCreateFile = (authority == null || m.q1(authority, ShareConstants.WEB_DIALOG_PARAM_MEDIA, false)) ? false : true;
                } else if (m.S0(ShareInternalUtility.STAGING_PARAM, uri.getScheme(), true)) {
                    this.shouldCreateFile = true;
                } else if (!Utility.isWebUri(uri)) {
                    throw new FacebookException(p0.a.z0(scheme, "Unsupported scheme for media Uri : "));
                }
            } else {
                if (bitmap == null) {
                    throw new FacebookException("Cannot share media without a bitmap or Uri set");
                }
                this.shouldCreateFile = true;
            }
            String uuid2 = !this.shouldCreateFile ? null : UUID.randomUUID().toString();
            this.attachmentName = uuid2;
            this.attachmentUrl = !this.shouldCreateFile ? String.valueOf(uri) : FacebookContentProvider.Companion.getAttachmentUrl(FacebookSdk.getApplicationId(), uuid, uuid2);
        }

        @Nullable
        public final String getAttachmentName() {
            return this.attachmentName;
        }

        @NotNull
        public final String getAttachmentUrl() {
            return this.attachmentUrl;
        }

        @Nullable
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @NotNull
        public final UUID getCallId() {
            return this.callId;
        }

        @Nullable
        public final Uri getOriginalUri() {
            return this.originalUri;
        }

        public final boolean getShouldCreateFile() {
            return this.shouldCreateFile;
        }

        public final boolean isContentUri() {
            return this.isContentUri;
        }

        public final void setContentUri(boolean z2) {
            this.isContentUri = z2;
        }

        public final void setShouldCreateFile(boolean z2) {
            this.shouldCreateFile = z2;
        }
    }

    private NativeAppCallAttachmentStore() {
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void addAttachments(@org.jetbrains.annotations.Nullable java.util.Collection<com.facebook.internal.NativeAppCallAttachmentStore.Attachment> r5) throws com.facebook.FacebookException {
        /*
            if (r5 == 0) goto L91
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto La
            goto L91
        La:
            java.io.File r0 = com.facebook.internal.NativeAppCallAttachmentStore.attachmentsDirectory
            if (r0 != 0) goto L11
            cleanupAllAttachments()
        L11:
            ensureAttachmentsDirectoryExists()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()     // Catch: java.io.IOException -> L52
        L1d:
            boolean r1 = r5.hasNext()     // Catch: java.io.IOException -> L52
            if (r1 == 0) goto L68
            java.lang.Object r1 = r5.next()     // Catch: java.io.IOException -> L52
            com.facebook.internal.NativeAppCallAttachmentStore$Attachment r1 = (com.facebook.internal.NativeAppCallAttachmentStore.Attachment) r1     // Catch: java.io.IOException -> L52
            boolean r2 = r1.getShouldCreateFile()     // Catch: java.io.IOException -> L52
            if (r2 != 0) goto L30
            goto L1d
        L30:
            java.util.UUID r2 = r1.getCallId()     // Catch: java.io.IOException -> L52
            java.lang.String r3 = r1.getAttachmentName()     // Catch: java.io.IOException -> L52
            r4 = 1
            java.io.File r2 = getAttachmentFile(r2, r3, r4)     // Catch: java.io.IOException -> L52
            if (r2 == 0) goto L1d
            r0.add(r2)     // Catch: java.io.IOException -> L52
            android.graphics.Bitmap r3 = r1.getBitmap()     // Catch: java.io.IOException -> L52
            if (r3 == 0) goto L54
            com.facebook.internal.NativeAppCallAttachmentStore r3 = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE     // Catch: java.io.IOException -> L52
            android.graphics.Bitmap r1 = r1.getBitmap()     // Catch: java.io.IOException -> L52
            r3.processAttachmentBitmap(r1, r2)     // Catch: java.io.IOException -> L52
            goto L1d
        L52:
            r5 = move-exception
            goto L69
        L54:
            android.net.Uri r3 = r1.getOriginalUri()     // Catch: java.io.IOException -> L52
            if (r3 == 0) goto L1d
            com.facebook.internal.NativeAppCallAttachmentStore r3 = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE     // Catch: java.io.IOException -> L52
            android.net.Uri r4 = r1.getOriginalUri()     // Catch: java.io.IOException -> L52
            boolean r1 = r1.isContentUri()     // Catch: java.io.IOException -> L52
            r3.processAttachmentFile(r4, r1, r2)     // Catch: java.io.IOException -> L52
            goto L1d
        L68:
            return
        L69:
            java.lang.String r1 = com.facebook.internal.NativeAppCallAttachmentStore.TAG
            java.lang.String r2 = "Got unexpected exception:"
            java.lang.String r2 = p0.a.z0(r5, r2)
            android.util.Log.e(r1, r2)
            java.util.Iterator r0 = r0.iterator()
        L78:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8b
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            if (r1 != 0) goto L87
            goto L78
        L87:
            r1.delete()     // Catch: java.lang.Exception -> L78
            goto L78
        L8b:
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            r0.<init>(r5)
            throw r0
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.NativeAppCallAttachmentStore.addAttachments(java.util.Collection):void");
    }

    public static final void cleanupAllAttachments() {
        File attachmentsDirectory2 = getAttachmentsDirectory();
        if (attachmentsDirectory2 == null) {
            return;
        }
        e0.q(attachmentsDirectory2);
    }

    public static final void cleanupAttachmentsForCall(@NotNull UUID uuid) {
        p0.a.s(uuid, "callId");
        File attachmentsDirectoryForCall = getAttachmentsDirectoryForCall(uuid, false);
        if (attachmentsDirectoryForCall == null) {
            return;
        }
        e0.q(attachmentsDirectoryForCall);
    }

    @NotNull
    public static final Attachment createAttachment(@NotNull UUID uuid, @NotNull Bitmap bitmap) {
        p0.a.s(uuid, "callId");
        p0.a.s(bitmap, "attachmentBitmap");
        return new Attachment(uuid, bitmap, null);
    }

    @Nullable
    public static final File ensureAttachmentsDirectoryExists() {
        File attachmentsDirectory2 = getAttachmentsDirectory();
        if (attachmentsDirectory2 != null) {
            attachmentsDirectory2.mkdirs();
        }
        return attachmentsDirectory2;
    }

    @Nullable
    public static final File getAttachmentFile(@NotNull UUID uuid, @Nullable String str, boolean z2) throws IOException {
        p0.a.s(uuid, "callId");
        File attachmentsDirectoryForCall = getAttachmentsDirectoryForCall(uuid, z2);
        if (attachmentsDirectoryForCall == null) {
            return null;
        }
        try {
            return new File(attachmentsDirectoryForCall, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Nullable
    public static final synchronized File getAttachmentsDirectory() {
        File file;
        synchronized (NativeAppCallAttachmentStore.class) {
            try {
                if (attachmentsDirectory == null) {
                    attachmentsDirectory = new File(FacebookSdk.getApplicationContext().getCacheDir(), ATTACHMENTS_DIR_NAME);
                }
                file = attachmentsDirectory;
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    @Nullable
    public static final File getAttachmentsDirectoryForCall(@NotNull UUID uuid, boolean z2) {
        p0.a.s(uuid, "callId");
        if (attachmentsDirectory == null) {
            return null;
        }
        File file = new File(attachmentsDirectory, uuid.toString());
        if (z2 && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Nullable
    public static final File openAttachment(@Nullable UUID uuid, @Nullable String str) throws FileNotFoundException {
        if (Utility.isNullOrEmpty(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return getAttachmentFile(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    private final void processAttachmentBitmap(Bitmap bitmap, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            Utility.closeQuietly(fileOutputStream);
        }
    }

    private final void processAttachmentFile(Uri uri, boolean z2, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            Utility.copyAndCloseInputStream(!z2 ? new FileInputStream(uri.getPath()) : FacebookSdk.getApplicationContext().getContentResolver().openInputStream(uri), fileOutputStream);
            Utility.closeQuietly(fileOutputStream);
        } catch (Throwable th) {
            Utility.closeQuietly(fileOutputStream);
            throw th;
        }
    }

    @NotNull
    public static final Attachment createAttachment(@NotNull UUID uuid, @NotNull Uri uri) {
        p0.a.s(uuid, "callId");
        p0.a.s(uri, "attachmentUri");
        return new Attachment(uuid, null, uri);
    }
}
