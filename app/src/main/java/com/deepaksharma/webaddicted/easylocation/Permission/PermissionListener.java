package com.deepaksharma.webaddicted.easylocation.Permission;

import java.util.List;

public interface PermissionListener {
    void onPermissionGranted(List<String> mCustomPermission);
    void onPermissionDenied(List<String> mCustomPermission);
}
