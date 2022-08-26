from django.urls import path

from . import views

urlpatterns = [
    path("", views.index, name="Index"),
    path("<str:name>", views.greet, name="greet"),
    path("abhi", views.abhi, name="abhi"),
    path("gautam", views.gautam, name="gautam")
]