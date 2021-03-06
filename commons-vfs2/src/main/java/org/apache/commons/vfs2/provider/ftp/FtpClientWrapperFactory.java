/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */
package org.apache.commons.vfs2.provider.ftp;

import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemOptions;
import org.apache.commons.vfs2.provider.GenericFileName;

/**
 * FTP client wrapper creation factory class.
 */
class FtpClientWrapperFactory implements ClientWrapperFactory {

    private final GenericFileName root;
    private final FileSystemOptions fileSystemOptions;
    private final Integer defaultTimeout;

    FtpClientWrapperFactory(GenericFileName root, FileSystemOptions fileSystemOptions, Integer defaultTimeout) {
        this.root = root;
        this.fileSystemOptions = fileSystemOptions;
        this.defaultTimeout = defaultTimeout;
    }

    @Override
    public FtpClient create() throws FileSystemException {
        return new FtpClientWrapper(root, fileSystemOptions, defaultTimeout);
    }
}
