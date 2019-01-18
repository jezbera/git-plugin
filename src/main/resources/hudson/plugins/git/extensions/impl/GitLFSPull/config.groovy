package hudson.plugins.git.extensions.impl.GitLFSPull

def f = namespace(lib.FormTagLib);

f.entry(title:_("Fetch only these objects"), field:"fetchInclude") {
    f.textbox()
}
f.entry(title:_("Exclude these objects"), field:"fetchExclude") {
    f.textbox()
}
